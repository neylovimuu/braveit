package lesson2;

import java.text.DecimalFormat;

public class TaskFour {
    public static void main(String[] args) {
        double faringate = 35.5;
        double celsius = convertToCelsius(faringate);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(faringate + " F = " + df.format(celsius) + " C ");
    }

    public static double convertToCelsius(double degreeFahrenheit) {
        return (degreeFahrenheit - 32) * 5 / 9;
    }
}

