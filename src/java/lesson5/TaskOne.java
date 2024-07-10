package lesson5;
/**
 * Написати програму Java яка отримує n- чисел типу int як передані параметри. Порахувати їх суму,
 * результат вивести в консоль.
 */
public class TaskOne {
    public static void main(String[] args) {
        int [] myArray = {1, 5, 60};
        int [] myArray1 = {1, 5, -60, 10};
        System.out.println(sumOfElement(myArray));
        System.out.println(sumOfElement(myArray1));
    }

    public static int sumOfElement(int[] array) {
        int  result = 0;
        for (int j : array) {
            result += j;
        }
        return result ;

    }


}
