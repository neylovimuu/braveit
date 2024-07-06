package lesson4;
//Напишіть програму для обчислення суми цифр цілого числа.
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int firstNumber = scanner.nextInt();
        int sum = 0;

        while (firstNumber > 0) {
            int firstPartNumber = firstNumber % 10;
            sum = sum + firstPartNumber;
            firstNumber = firstNumber / 10;

        }
            System.out.println(sum);
        }
}
