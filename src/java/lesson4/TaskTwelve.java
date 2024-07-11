package lesson4;

/**
 * Напишіть програму для друку всіх чисел Армстронга від 1 до 500
 */
public class TaskTwelve {
    public static void main(String[] args){
        int number = 1;

        while (number <= 500) {
            int temp = number;
            int sum = 0;

            while (temp != 0){
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == number) {
                System.out.println(number);
            }
            number ++;
        }
    }
}
