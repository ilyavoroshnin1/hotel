package multithreathing;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService ex = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++)
            ex.submit(new Pros(countDownLatch));

            ex.shutdown();

            countDownLatch.await();
            System.out.println("Latch has been opened");
    }
}

class Pros implements Runnable {
    private CountDownLatch countDownLatch;

    public Pros(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        countDownLatch.countDown();
    }
}
