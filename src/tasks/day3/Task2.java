package tasks.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(" Введите делимое: ");
            Double a = scanner.nextDouble();
            System.out.print(" Введите делитель: ");
            Double b = scanner.nextDouble();

            double c = a / b;
            if (b == 0)
                break;
            System.out.println(" Результат деления: " + c);
        }
    }
}
