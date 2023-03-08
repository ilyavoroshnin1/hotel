package collectionsTraining;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(33);
        set1.add(44);
        set1.add(55);

        Set<Integer> set2 = new HashSet<>();
        set2.add(33);
        set2.add(44);
        set2.add(55);
        set2.add(66);
        set2.add(-77);
        set2.add(888);
        set2.add(-888);

        Set<Integer> union = new HashSet<>(set1);
        union.removeAll(set2);
        System.out.println(union);
    }
}
