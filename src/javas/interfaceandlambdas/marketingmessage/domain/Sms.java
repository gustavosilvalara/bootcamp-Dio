package javas.interfaceandlambdas.marketingmessage.domain;

public class Sms implements MarketingMessage{
    protected String number;
    protected String message;

    @Override
    public void invite(String number, String message) {
        this.number = number;
        this.message = message;
        System.out.println("enviando a mensagem para o numero " + number + " mensagem escrita: "
                            + message);
    }

}
