package lesson5;
/**
 * Створити функцію, яка може перетворити рядок на число.
 */
public class TaskOne {
    public static void main(String[] args) {
        String myString = "12345"; // створив рядок
        System.out.println(myString); // вивів в консоль сворений рядок

        int number = Integer.parseInt(myString); // використав метод який перетворив рядок в число
        System.out.println("Ціле число: " + number); // вивів в консоль перетворений рядок в число
        System.out.println(number + 5); // Для наглядної різниці
        System.out.println(myString + 5); // Для наглядної різниці
    }
}
