package tasks.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMV");
        list.add("Audi");
        list.add("Nissan");
        list.add("Bentley");
        list.add("Renault");
        System.out.println(list);
        list.add(2,"Mercedes");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
