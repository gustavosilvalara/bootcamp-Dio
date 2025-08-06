package javas.sudoko.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javas.sudoko.service.EventEnum.CLEAR_SPACE;

public class NotifierService {

    private final Map<EventEnum, List<EventListener>> listener = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventEnum, EventListener eventListener){
        var selectedListeners = listener.get(eventEnum);
        selectedListeners.add(eventListener);
    }

    public void notify(final EventEnum eventEnum){
        listener.get(eventEnum).forEach(l -> l.update(eventEnum));
    }
}
