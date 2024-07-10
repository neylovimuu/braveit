package lesson5;

import java.util.Scanner;
/**
 * Напишіть програму на Java, щоб перевірити, чи містить масив певне значення.
 */
public class TaskFour {
    public static void main(String[] args) {
        String[] letters = {"Apple", "Baby", "Cat", "Dog"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення яке потрібно перевірити ");
        String charachter = scanner.nextLine();

        boolean found = false;
        for (String letter : letters) {
            if (letter.equals(charachter)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Знайдено введене значення в масиві");
        } else {
            System.out.println("Введене значення не знайдено в масиві");
        }
    }
}
