package java.inheritanceandpolymorphism.users.domain.noadm;

import java.inheritanceandpolymorphism.users.domain.adm.Funcionario;

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
