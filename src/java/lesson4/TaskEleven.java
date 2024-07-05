package lesson4;
//Напишіть програму, яка пропонує користувачеві ввести ціле число, а потім виводить число з
//перевернутими цифрами. Наприклад, якщо введено 12345, вихід має бути 54321.
import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число: ");
        int number = scanner.nextInt();
        int reversNumber = 0;

        while (number != 0) {
            reversNumber = reversNumber * 10 + number % 10;
            number /= 10;

        }
        System.out.println(reversNumber);
    }
}