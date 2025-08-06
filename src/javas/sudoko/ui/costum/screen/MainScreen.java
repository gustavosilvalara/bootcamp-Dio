package javas.sudoko.ui.costum.screen;

import javas.sudoko.model.GameStatusEnum;
import javas.sudoko.model.Space;
import javas.sudoko.service.BoardService;
import javas.sudoko.service.EventEnum;
import javas.sudoko.service.NotifierService;
import javas.sudoko.ui.costum.button.CheckStatusButon;
import javas.sudoko.ui.costum.button.FinishGameButton;
import javas.sudoko.ui.costum.button.ResetButton;
import javas.sudoko.ui.costum.frame.MainFrame;
import javas.sudoko.ui.costum.input.NumberText;
import javas.sudoko.ui.costum.panel.MainPanel;
import javas.sudoko.ui.costum.panel.SudokuSector;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static javas.sudoko.service.EventEnum.CLEAR_SPACE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class MainScreen {

    private final static Dimension dimension = new Dimension(600, 600);

    private final BoardService boardService;
    private final NotifierService notifierService;

    private JButton checkGameStatusButton;
    private JButton resetButton;
    private JButton finishGameButton;


    public MainScreen(Map<String, String> gameConfig) {
        this.boardService = new BoardService(gameConfig);
        this.notifierService = new NotifierService();
    }

    public void biuldMainScreen() {
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        for (int r = 0; r < 9; r += 3) {
            int endRow = r + 2;
            for (int c = 0; c < 9; c += 3) {
                int endCol = c + 2;
                var spaces = getSpacesFromSector(boardService.getSpaces(), c, endCol, r, endRow);
                mainPanel.add(generateSection(spaces));
            }
        }
        addResetButton(mainPanel);
        addCheckGameStatus(mainPanel);
        addFinishGame(mainPanel);
        mainFrame.revalidate();
        mainPanel.repaint();

    }

    private List<Space> getSpacesFromSector(final List<List<Space>> spaces,
                                             final int initCol, final int endCol,
                                             final int initRow, final int endRow){
        List<Space> spaceSector = new ArrayList<>();
        for (int r = initRow; r <= endRow; r++) {
            for (int c = initCol; c <= endCol; c++) {
                spaceSector.add(spaces.get(c).get(r));
            }
        }
        return spaceSector;
    }

    private JPanel generateSection(final List<Space> spaces){
        List<NumberText> fields = new ArrayList<>(new ArrayList<>(spaces.stream().map(NumberText::new).toList()));
        fields.forEach(t -> notifierService.subscribe(CLEAR_SPACE, t));
        return new SudokuSector(fields);
    }

    private void addResetButton(final JPanel mainPanel) {
        resetButton = new ResetButton(e -> {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente reiniciar o jogo?",
                    "Limpar o jogo",
                    YES_NO_OPTION,
                    QUESTION_MESSAGE);
            if (dialogResult == 0) {
                boardService.reset();
                notifierService.notify(CLEAR_SPACE);
            }
        });
        mainPanel.add(resetButton);
    }

    private void addCheckGameStatus(final JPanel mainPanel) {
        checkGameStatusButton = new CheckStatusButon(e -> {
            boolean hasErros = boardService.hasErros();
            GameStatusEnum gameStatus = boardService.getStatus();
            var message = switch (gameStatus) {
                case NON_STARTER -> "O jogo não foi iniciado!!";
                case INCOMPLETE -> "O jogo está incompleto!!";
                case COMPLETE -> "O jogo está completo!!";
            };
            message += hasErros ? " e contém erros" : " e não contem erros";
            JOptionPane.showMessageDialog(null, message);
        });
        mainPanel.add(checkGameStatusButton);
    }

    private void addFinishGame(final JPanel mainPanel) {
        finishGameButton = new FinishGameButton(e -> {
            if (boardService.gameFinished()) {
                JOptionPane.showMessageDialog(null, "Parabens você concluiu o jogo");
                resetButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Seu jogo contém uma inconsistência, ajuste e tente novamente");
            }
        });

        mainPanel.add(finishGameButton);
    }

}
