package javas.collections.listandarrays;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        OffsetDateTime startLinke = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            linkedList.add(i);
        }
        System.out.println(Duration.between(startLinke, OffsetDateTime.now()).toMillis());

        List<Integer> arrayList = new ArrayList<>();
        OffsetDateTime startArray = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(startArray, OffsetDateTime.now()).toMillis());

        List<Integer> vectorList = new Vector<>();
        OffsetDateTime startVector = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            vectorList.add(i);
        }
        System.out.println(Duration.between(startVector, OffsetDateTime.now()).toMillis());
    }
}
