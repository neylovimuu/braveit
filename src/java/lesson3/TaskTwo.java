package lesson3;

public class TaskTwo {
    public static void main(String[] args) {
        int dayNumber = 22;
        System.out.println("Введено число " + dayNumber);
        String d1 = switch (dayNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Щось пішло не так, ти впевнений що правильно вказав номер дня?";
        };
        System.out.println(d1);
    }
}
