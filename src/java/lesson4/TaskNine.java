package lesson4;

import java.util.Scanner;

/**
 * Напишіть програму для знаходження факторіалу будь-якого числа, введеного з клавіатури.
 */
public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = scanner.nextInt();
        int factorial = 1;
        int one = 1;

        while (one <= number) {
            factorial = factorial * one;
            one++;

        }
        System.out.println("Факторіал введеного числа: " + factorial);
    }
}
