package lesson5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишіть програму на Java для видалення певного елемента з масиву
 */
public class TaskFive {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(letters));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення яке потрібно видалити: ");
        String character = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(character)) {

                for (int j = i; j < letters.length - 1; j++) {
                    letters[j] = letters[j + 1];
                }
                letters[letters.length - 1] = null;

                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Видалено значення " + character + " з масиву.");
            System.out.println("Змінений масив: " + Arrays.toString(letters));
        } else {
            System.out.println("Значення " + character + " не знайдено в масиві.");
        }
    }
}