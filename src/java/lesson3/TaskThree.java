package lesson3;

public class TaskThree {
    public static void main(String[] args) {
        int month = 15;
        String s1 = switch (month) {
                case 1, 2, 12 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Fall";
                default -> "Бро, рік складається з 12 місяців, не тупи";
        };
        System.out.println(s1);
    }
}