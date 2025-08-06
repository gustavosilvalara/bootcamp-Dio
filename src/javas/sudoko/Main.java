package javas.sudoko;

import javas.sudoko.model.Board;

import javas.sudoko.model.Space;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static javas.sudoko.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toMap;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args).collect
                (toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        int option = -1;
        while (true){
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar Jogo");
            System.out.println("7 - Finalizar Jogo");
            System.out.println("8 - Siar");

            option = scanner.nextInt();

            switch (option){
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGmae();
                case 8 ->System.exit(0);
                default -> System.out.println("Opção invalida, selecione uma das opções do menu");
            }
        }
    }

    private static void startGame(Map<String, String> positions) {
        if(nonNull(board)){
            System.out.println("O Jogo já foi iniciado!!");
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                String positionConfig = positions.get("%s,%s,".formatted(i,j));
                int expected = Integer.parseInt(positionConfig.split(",")[0]);
                boolean fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                Space currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        board = new Board(spaces);
        System.out.println("O jogo está pronto para começar");
    }

    private static void inputNumber() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }

        System.out.println("Informe a coluna em que o número será inserido ");
        int col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha em que o número será inserido ");
        int row = runUntilGetValidNumber(0,8);
        System.out.printf("Informe o número que irá entrar na posição [%s,%s]\n", col,row);
        int value = runUntilGetValidNumber(1,9);
        if (!board.changeValue(col, row, value)){
            System.out.printf("A posição [%s,%s], tem um valor fixo \n", col, row);
        }
    }

    private static void removeNumber() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }

        System.out.println("Informe a coluna em que o número será removido ");
        int col = runUntilGetValidNumber(0,8);
        System.out.println("Informe a linha em que o número será removido ");
        int row = runUntilGetValidNumber(0,8);
        if (!board.clearValue(col, row)){
            System.out.printf("A posição [%s,%s], tem um valor fixo \n", col, row);
        }
    }

    private static void showCurrentGame() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }
        var args = new Object[81];
        int argsPos = 0;
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (List<Space> col : board.getSpaces()) {
                args[argsPos ++] = " " + ((isNull(col.get(i).getActual())) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("Seu jogo se encontra da seguinte forma");
        System.out.printf((BOARD_TEMPLATE) + "%n", args);
    }

    private static void showGameStatus() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }
        System.out.printf("O jogo se encontra no status %s\n", board.getStats().getLabel());
        if (board.hasErrors()){
            System.out.println("O jogo contem erros!!!");
        }else {
            System.out.println("O jogo não contem erros!!!");
        }
    }

    private static void clearGame() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }

        System.out.println("Tem certeza que deseja limpar o seu jogo e perder todo seu progresso?");
        String confirm = scanner.nextLine();

        while(!confirm.equalsIgnoreCase("sim") || !confirm.equalsIgnoreCase("não")){
            confirm = scanner.nextLine();
            System.out.println("Informe 'sim' ou 'não'");
        }

        if (confirm.equalsIgnoreCase("sim")){
            board.reset();
        }
    }

    private static void finishGmae() {
        if(isNull(board)){
            System.out.println("O Jogo ainda não foi iniciado!!");
        }

        if (board.gameIsFinished()){
            System.out.println("Parabéns você concluiu o jogo");
            showCurrentGame();
            board = null;
        }else if (board.hasErrors()){
            System.out.println("Seu jogo contém erros, verifique seu board e ajuste-o");
        }else{
            System.out.println("Você ainda precisa preencher algum espaço");
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max){
        int current = scanner.nextInt();
        while (current < min || current > max){
            System.out.println("informe um número entre " + min + " e " + max);
            current = scanner.nextInt();
        }
        return current;
    }
}
