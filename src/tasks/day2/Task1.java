package tasks.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = scanner.nextInt();
        System.out.println();

        if (numberOfFloors > 0 && numberOfFloors <= 4) {
            System.out.println(" Малоэтажный дом ");
        } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
            System.out.println(" Среднеэтажный дом ");
        } else if (numberOfFloors >= 9 ) {
            System.out.println( " Многоэтажный дом ");
        } else if (numberOfFloors < 1) {
            System.out.println( " Такого дома не существует ");
        }
    }
}
