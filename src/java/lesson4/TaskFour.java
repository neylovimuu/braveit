package lesson4;
//Вивести парні числа від -100 до 200
public class TaskFour {
    public static void main(String[] args) {
        for(int number = -100; number <= 200; number = number + 2) {
            System.out.println(number);
        }
    }
}
