package java.inheritanceandpolymorphism.users.domain.adm;

public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        setAdm(true);
    }

    public void gerarRelatorioFinanceiro(){

    }

    public void consultarVendas(){
        System.out.println("Vendas realizadas " + getVendas());
    }
}
