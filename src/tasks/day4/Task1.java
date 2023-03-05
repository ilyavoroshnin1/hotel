package tasks.day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число от 1 до 10 ");
        int arrayLenght = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(1,10);

        System.out.println(Arrays.toString(array));
        System.out.println(" Длина произвольного массива - " + array.length + " элементов ");
        System.out.println();

        int check8 = 0;
        int check1 = 0;
        int checkeven = 0;
        int checkNotEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                check8++;
        }
        System.out.println(" Количество чисел в массиве больше 8 - " + check8 + " элементов ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                check1++;
        }
        System.out.println(" Количество чисел в массиве = 1 - " + check1 + " элементов ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                checkeven++;
        }
        System.out.println(" Количество четных чисел в массиве - " + checkeven + " элементов ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                checkNotEven++;
        }
        System.out.println(" Количество нечетных чисел в массиве - " + checkNotEven + " элементов ");

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(" Сумма всех элементов в массиве = " + sum);

    }
}
