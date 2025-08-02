package java.collectionsandstream.map.ordenacao.agendaeventos.dominio;

public class Evento {

    private String evento;

    private String atracao;

    public Evento(String evento, String atracao) {
        this.evento = evento;
        this.atracao = atracao;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "evento='" + evento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
