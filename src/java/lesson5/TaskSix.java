package lesson5;
/**
 * Напишіть програму на Java для знаходження максимального та мінімального
 * значення масиву
 */
public class TaskSix {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1, 5, 3};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);
    }
}