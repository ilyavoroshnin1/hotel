package multithreathing;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    @Override
    public void run() {
        while (running) {
            System.out.println(" Hello ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}
