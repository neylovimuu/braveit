package lesson4;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Числа рівні");
        } else {
            System.out.println("Числа НЕрівні");
        }
    }
}
