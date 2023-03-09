package collectionsTraining;

import java.util.*;

public class TestSorted {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person(4, "George"));
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(2, "Jack"));
        collection.add(new Person(3, "Mike"));

    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.id) {
            return -1;
        } else if (this.id < o.id) {
            return 1;
        } else
            return 0;
    }
}


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

//        List<Person> people = new ArrayList<>();
//        people.add(new Person(3, "Jack"));
//        people.add(new Person(2, "Nik"));
//        people.add(new Person(1, "Bob"));
//
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.id > o2.id) {
//                    return 1;
//                } else if (o1.id < o2.id) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(people);
