package multithreathing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSynchronized2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToListOne() throws InterruptedException {
        synchronized (lock1) {
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt(100));
            }
        }
    }

    public void addToListOne2() throws InterruptedException {
        synchronized (lock1) {
            for (int i = 0; i < 1000; i++) {
                list2.add(random.nextInt(100));
            }
        }
    }
    public void work() throws InterruptedException {
        addToListOne();
        addToListOne2();
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println(after - before);
        System.out.println(list.size());
        System.out.println(list2.size());
    }
}
