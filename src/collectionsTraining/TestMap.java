package collectionsTraining;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);

    }

    public static void testMap(Map<String, String> map) {

        map.put("zalupa", "Bob");
        map.put("C", "Stan");
        map.put("Dad", "Tim");
        map.put("Aa", "Bob");
        map.put("bB", "Mike");
        map.put("else if", "Bill");
        map.put("-", "Bill");
        map.put("*", "Bill");
        map.put(" ", "Bill");



        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
