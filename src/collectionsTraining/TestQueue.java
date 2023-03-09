package collectionsTraining;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        PersonP person1 = new PersonP(1);
        PersonP person2 = new PersonP(2);
        PersonP person3 = new PersonP(3);
        PersonP person4 = new PersonP(4);

        Queue<PersonP> people = new ArrayBlockingQueue<>(3);
        people.offer(person3);
        people.offer(person4);
        people.offer(person2);
        people.offer(person1);
        System.out.println(people);
//        System.out.println(people.offer(person4));
//        System.out.println(people.offer(person2));
//        System.out.println(people.offer(person1));

//        System.out.println(people);
//        System.out.println(people.remove());
//        System.out.println(people.peek());
//        System.out.println(people);
    }
}

class PersonP {
    private int id;

    public PersonP(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonP{" +
                "id=" + id +
                '}';
    }
}
