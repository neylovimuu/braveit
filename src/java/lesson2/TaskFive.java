package lesson2;

public class TaskFive {

    public static void main(String[] args) {
        double duymu = 35.5;
        double santimetr = convertToSantimetr(duymu);

        System.out.println(duymu + " Дюймів = " + santimetr + " Сантиметрів");

    }
    public static double convertToSantimetr(double duymu) {
        return duymu * 2.54;
    }
}
