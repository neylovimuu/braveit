package lesson4;

import java.util.Scanner;

/**
 * Напишіть програму для обчислення суми цифр цілого числа.
 */
public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int oneNumber = scanner.nextInt();
        int sum = 0;

        while (oneNumber > 0) {
            int firstPartNumber = oneNumber % 10;
            sum += firstPartNumber;
            oneNumber = oneNumber / 10;

        }
        System.out.println(sum);
    }
}
