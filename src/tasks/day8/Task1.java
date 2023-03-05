package tasks.day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++)
            numbers += i + " ";
        long after = System.currentTimeMillis();
        System.out.println(" Время выполнения метода String " + (after-before) );
        System.out.print(numbers);
        System.out.println();
        System.out.println();

        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++)
            sb.append(i).append(" ");
        after = System.currentTimeMillis();
        System.out.println(" Время выполнения метода Builder " + (after-before) );
        System.out.print(sb);
        System.out.println();
    }
}
