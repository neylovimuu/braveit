package lesson2;

public class lesson2task5 {

    public static void main(String[] args) {
        double inch = 35.5;
        double sm = convertToInch(inch);

        System.out.println(inch + " Дюймів = " + sm + " Сантиметрів");

    }
    public static double convertToInch(double centimeter) {
        return (centimeter * 2.54); // тут я щось не розумію як компілятор розуміє що "centimeter" це саме "35.5"
    }
}
