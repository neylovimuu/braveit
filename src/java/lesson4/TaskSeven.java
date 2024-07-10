package lesson4;
/**
 * Напишіть програму для обчислення суми перших 10 натуральних чисел.
 */
public class TaskSeven {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Сума перших 10 натуральних чисел: " + sum);
    }
}
