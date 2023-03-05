package tasks.day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        }
    }
}
