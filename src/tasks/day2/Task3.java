package tasks.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Введите первое число");
        int a = scanner.nextInt();
        System.out.println( " Введите второе число");
        int b = scanner.nextInt();

        int i = a + 1;
        while (i < b){
            if (i % 5 == 0 && i % 10 != 0)
                System.out.println(i);
                    i++;
        }
    }
}
