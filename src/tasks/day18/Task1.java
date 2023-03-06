package tasks.day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50420, -42, 855, -1111, 45, 1, -51000};
        sum(numbers, 0);
    }

    public static int sum (int[] numbers, int i) {
        if (i == numbers.length)
            return 0;
        return numbers[i] + sum(numbers, i+1);
    }
}
