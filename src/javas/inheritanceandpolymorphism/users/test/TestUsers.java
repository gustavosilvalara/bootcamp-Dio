package javas.inheritanceandpolymorphism.users.test;

import javas.inheritanceandpolymorphism.users.domain.adm.Gerente;
import javas.inheritanceandpolymorphism.users.domain.noadm.Vendedor;

public class TestUsers {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Gustavo", "Email@example.com", "123");

        Gerente gerente = new Gerente("Henrique", "Email@example.com", "1234");

    }
}
