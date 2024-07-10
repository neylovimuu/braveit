package lesson5;

import java.util.Scanner;

/**
 * Напишіть програму, яка знаходить суму кожного числа від 1 до num. Число завжди
 * буде додатним цілим числом, більшим за 0.
 */
 public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число num: ");
        int num = scanner.nextInt();

        while (num <= 0) {
            System.out.println("Введене число повинно бути додатнім цілим числом, більшим за 0.");
            System.out.println("Будь ласка, введіть коректне значення:");
            num = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сума від 1 до " + num + " дорівнює " + sum);

    }
}
