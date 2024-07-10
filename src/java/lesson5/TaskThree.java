package lesson5;

/**
 * Написати програму на Java для обчислення середнього значення елементів
 * масиву.
 */
public class TaskThree {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double sum = 0;
        int averegeValue = 0;

        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];

        }
        sum = sum / numbers.length;
        System.out.println(sum);

    }
}
