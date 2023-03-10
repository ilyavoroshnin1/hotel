package multithreathing;

public class Multithead {
    public static void main(String[] args) throws InterruptedException {
//        Pupka p1 = new Pupka(" Уборка");
//        Pupka p2 = new Pupka(" Ремонт");
//        Pupka p3 = new Pupka(" Стирка");
//
//        p1.start();
//        p2.start();
//        p3.start();
//        System.out.println(" Да начнется многопоточность: ");

//        Thread p1 = new Thread(new RunnablePupka(" Егор"));
//        Thread p2 = new Thread(new RunnablePupka(" Борис"));
//        Thread p3 = new Thread(new RunnablePupka(" Степан"));
//
//        p1.start();
//        p2.start();
//        p3.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Егор выкурил " + i + " сигарет");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Андрей выпил " + i + " бутылок");
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Саня съел " + i + " яблок");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

class Pupka extends Thread {
    String task;

    public Pupka(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Задание " + task + " выполнено на: " + i + " %");
        }
    }
}

class RunnablePupka implements Runnable {
    String name;

    public RunnablePupka(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Студент " + name + " закончил обучение на: " + i + " %");
        }
    }
}
