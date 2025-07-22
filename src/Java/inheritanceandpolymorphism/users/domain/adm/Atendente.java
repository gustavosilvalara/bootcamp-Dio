package Java.inheritanceandpolymorphism.users.domain.adm;

public class Atendente extends Funcionario{
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);

    }

    public void pagamentos(double dinheiro){
        setDinheiro(getDinheiro() + dinheiro);
        System.out.println("Colocado no caixa");
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa");
    }
}
