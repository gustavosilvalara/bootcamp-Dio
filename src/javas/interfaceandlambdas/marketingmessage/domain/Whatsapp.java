package javas.interfaceandlambdas.marketingmessage.domain;

public class Whatsapp implements MarketingMessage{
    protected String person;
    protected String message;


    @Override
    public void invite(String person, String message) {
        this.person = person;
        this.message = message;
        System.out.println("enviando a mensagem para o " + person + " mensagem escrita: "
                + message);
    }
}