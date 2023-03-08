package collectionsTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorted {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//        animals.add("women");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("do");
//        animals.add("d");
//        animals.add("");
//        animals.add(" ");
//        animals.add("-");
//        System.out.println(animals);
//        System.out.println();
//
//        Collections.sort(animals, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return -1;
//                } else if (o1.length() < o2.length()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(animals);
//    }

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Jack"));
        people.add(new Person(2, "Nik"));
        people.add(new Person(1, "Bob"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.id > o2.id) {
                    return 1;
                } else if (o1.id < o2.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);

    }

    static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
