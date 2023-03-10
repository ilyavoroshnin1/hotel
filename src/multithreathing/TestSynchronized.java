package multithreathing;

public class TestSynchronized {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        TestSynchronized test = new TestSynchronized();
        test.doWork();
    }

    public void counter() {
        synchronized (this) {
        counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                counter();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    counter();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
