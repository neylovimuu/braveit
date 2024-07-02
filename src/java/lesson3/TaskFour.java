package lesson3;

public class TaskFour {
    public static void main (String[] args){
        final int month = 12;
        System.out.println("Ви ввели " + month + " номер місяця і це є:");
        String m;
        if (month == 9 || month == 10 || month == 11 ) {
            m = "Fall";
        } else if (month == 6 || month == 7 || month == 8) {
            m = "Summer";
        } else if (month == 3 || month == 4 || month == 5) {
            m = "Spring";
        } else if (month == 12 || month == 1 || month == 2) {
            m = "Winter";
        } else {
            m = "Введіть корректний номер місяця (їх тільки 12).";
        }
        System.out.println(m);
    }
}
