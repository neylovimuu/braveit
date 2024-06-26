package lesson2;

import java.text.DecimalFormat;

public class lesson2task4 {
    public static void main(String[] args) {
        double F = 35.5;
        double C = convertToCelsius(F);

        DecimalFormat df = new DecimalFormat("#.##");        // виконав завдання і захотілось мені зменшити кількість знаків в фарингейтах після коми
        String formatC = df.format(C);

        System.out.println(F + " F " + formatC + " C ");

    }
        public static double convertToCelsius(double degreeFahrenheit) {
            return (degreeFahrenheit - 32) * 5 / 9;
        }

}

