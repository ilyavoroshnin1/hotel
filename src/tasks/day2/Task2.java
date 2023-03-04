package tasks.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Введите первое число");
        int a = scanner.nextInt();
        System.out.println( " Введите второе число");
        int b = scanner.nextInt();

        for (int i = a+1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.print(i + " ");
        }
    }
}
