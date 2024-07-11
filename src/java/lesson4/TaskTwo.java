package lesson4;

/**
 * Вивести парні числа від -100 до 200
 */
public class TaskTwo {
    public static void main(String[] args){
        int number = -100;
        do {
            System.out.println(number);
            number = number + 2;
        } while (number <= 200);
    }
}
