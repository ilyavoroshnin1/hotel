package tasks.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 5;

        while (i > 0) {
            System.out.print(" Введите делимое: ");
            Double a = scanner.nextDouble();
            System.out.print(" Введите делитель: ");
            Double b = scanner.nextDouble();
            double c = a / b;
            if (b == 0) {
                System.out.println( " На ноль делить нельзя! Повторите попытку");
                continue;
            }
            i--;
            System.out.println(" Результат деления: " + c + ". Осталось попыток: " + i);
        }
    }
}