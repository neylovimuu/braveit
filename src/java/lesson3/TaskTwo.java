package lesson3;

public class TaskTwo {
    public static void main(String[] args) {
        int dayNumber = 22;
        System.out.println("Введено число " + dayNumber);
        switch (dayNumber) {
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednesday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("Saturday");
                case 7 -> System.out.print("Sunday");
                default -> System.out.print("Щось пішло не так, ти впевнений що правильно вказав номер дня?");
        }
    }
}
