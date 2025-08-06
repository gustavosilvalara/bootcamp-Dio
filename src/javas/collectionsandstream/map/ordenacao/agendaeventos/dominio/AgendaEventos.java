package javas.collectionsandstream.map.ordenacao.agendaeventos.dominio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos implements Comparable<LocalDate>{

    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionar(LocalDate data, String nomeEvento, String atracao){
        Evento evento = new Evento(nomeEvento, atracao);
        agendaEventos.put(data, evento);
    }

    public Map<LocalDate, Evento> exibirAgenda(){
        return new TreeMap<>(agendaEventos);
    }

    public void obterProximoEvento(){
        LocalDate now = LocalDate.now();
        Map<LocalDate, Evento> proximo = new TreeMap<>(agendaEventos);
        for (Map.Entry<LocalDate, Evento> entry : proximo.entrySet()){
            if (entry.getKey().equals(now) || entry.getKey().isAfter(now)){
                System.out.println("O proximo evento será " + entry.getValue() + " na data " + entry.getKey());
                break;
            }
        }

    }


    public Map<LocalDate, Evento> getAgendaEventos() {
        return agendaEventos;
    }

    public void setAgendaEventos(Map<LocalDate, Evento> agendaEventos) {
        this.agendaEventos = agendaEventos;
    }


    @Override
    public int compareTo(LocalDate o) {
        return 0;
    }
}
