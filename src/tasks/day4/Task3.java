package tasks.day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10, 50);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum >= maxSum)
                maxSum = sum;
                maxSumIndex = i;
        }
    }
}
