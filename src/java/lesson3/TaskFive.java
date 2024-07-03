package lesson3;

public class TaskFive {
    public static void main(String[] args) {
        int month = 13;
        String m;
        switch (month) {
            case 12, 1, 2:
                m = "Winter";
                break;
            case 3, 4, 5:
                m = "Spring";
                break;
            case 6, 7, 8:
                m = "Summer";
                break;
            case 9, 10, 11:
                m = "Fall";
                break;
            default:
                m = "Ти шо? Маємо всього 12 місяців у році.";
        }
        System.out.println(m);
    }
}