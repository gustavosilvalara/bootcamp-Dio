package Java.inheritanceandpolymorphism.users.domain.noadm;

import Java.inheritanceandpolymorphism.users.domain.adm.Funcionario;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void realizarVenda(){
        setVendas(getVendas() + getVendas());
        System.out.println("Venda realizada" + getVendas());
    }

    public void consultarVendas(){
        System.out.println("Vendas realizadas " + getVendas());
    }


}
