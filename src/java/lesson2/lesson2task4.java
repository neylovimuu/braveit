package lesson2;

public class lesson2task4 {
    public static void main(String[] args) {
        double F = 35.5;
        double C = convertToCelsius(F);
        System.out.println(F + " F " + C + " C ");

    }
        public static double convertToCelsius(double degreeFahrenheit) {
            return (degreeFahrenheit - 32) * 5 / 9;
        }

}

