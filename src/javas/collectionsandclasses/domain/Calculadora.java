package javas.collectionsandclasses.domain;

import java.util.List;

public class Calculadora {

    public int calcular(List<Integer> numbers){
        return numbers.stream().reduce(0,Integer::sum);
    }

}
