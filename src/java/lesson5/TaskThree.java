package lesson5;

/**
 * Написати програму на Java для обчислення середнього значення елементів
 * масиву.
 */
public class TaskThree {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;

        for (int number : numbers) {
            sum += number;

        }
        double average = sum / numbers.length;
        System.out.println(average);
    }
}
