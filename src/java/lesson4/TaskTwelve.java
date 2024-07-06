package lesson4;
//Напишіть програму для друку всіх чисел Армстронга від 1 до 500
public class TaskTwelve {
    public static void main(String[] args){
        int number = 1;

        while (number <= 500) {
            int temporari = number;
            int sum = 0;

            while (temporari != 0){
                int digit = temporari % 10;
                sum += digit * digit * digit;
                temporari /= 10;
            }
            if (sum == number) {
                System.out.println(number);
            }
            number ++;
        }
    }
}
