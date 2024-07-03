package lesson4;

public class TaskFive {
    public static void main(String[] args){

        int decimalNumber = 15;
        System.out.println("Введено десятирічне число: " + decimalNumber);

        String octalNumber = Integer.toOctalString(decimalNumber);

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        String hexNumber = Integer.toHexString(decimalNumber);

        System.out.println("Восьмирічне: " + octalNumber);
        System.out.println("Двійкове: " + binaryNumber);
        System.out.println("Шістнадцятирічне: " + hexNumber);
    }
}