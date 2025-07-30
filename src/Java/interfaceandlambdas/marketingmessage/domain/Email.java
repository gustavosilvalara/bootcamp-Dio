package Java.interfaceandlambdas.marketingmessage.domain;

public class Email implements MarketingMessage{
    protected String email;
    protected String message;

    @Override
    public void invite(String email, String message) {
        this.email = email;
        this.message = message;
        System.out.println("enviando a mensagem para o email " + email + " mensagem escrita: "
                            + message);
    }
}
