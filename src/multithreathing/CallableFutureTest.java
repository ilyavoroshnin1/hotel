package multithreathing;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Random random = new Random();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Start");
                Thread.sleep(3000);
                System.out.println("Finish");

                return random.nextInt(10);
            }
        });
        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
