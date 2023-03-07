package collectionsTraining;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, " one");
        map.put(2, " two");
        map.put(4, " four");
        map.put(5, " fine");
        map.put(6, " six");
        map.put(7, " seven");
        map.put(8, " eight");
        map.put(9, " nine");
        System.out.println(map);

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
