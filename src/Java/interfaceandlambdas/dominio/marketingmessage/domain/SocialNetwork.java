package Java.interfaceandlambdas.dominio.marketingmessage.domain;

public class SocialNetwork implements MarketingMessage{
    protected String user;
    protected String message;


    @Override
    public void invite(String user, String message) {
        this.user = user;
        this.message = message;
        System.out.println("enviando a mensagem para o user " + user + " mensagem escrita: "
                + message);
    }
}

