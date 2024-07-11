package lesson4;

import java.util.Scanner;

/**
 * Напишіть програму для обчислення відстані між двома точками на поверхні землі.
 */
public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть широту першої точки:");
        double lat1 = scanner.nextDouble();
        System.out.println("Введіть довготу першої точки:");
        double lon1 = scanner.nextDouble();
        System.out.println("Введіть широту другої точки:");
        double lat2 = scanner.nextDouble();
        System.out.println("Введіть довготу другої точки:");
        double lon2 = scanner.nextDouble();

        double earthRadius = 6371.032;
        double lat1Radians = Math.toRadians(lat1);
        double lon1Radians = Math.toRadians(lon1);
        double lat2Radians = Math.toRadians(lat2);
        double lon2Radians = Math.toRadians(lon2);

        double deltaLat = lat2Radians - lat1Radians;
        double deltaLon = lon2Radians - lon1Radians;

        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
            Math.cos(lat1Radians) * Math.cos(lat2Radians) *
            Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;

        System.out.println("Відстань між двома точками: " + distance);
    }
}
