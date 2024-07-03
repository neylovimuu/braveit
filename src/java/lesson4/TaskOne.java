package lesson4;
//Завдання вивести непарні числа від 100 до 200
public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Кодиш, як бог, я в шоці, 4е заннятя,а ти вже таке виписуєш.Красень!");
        int count = 100;
        while (count <= 200) {
            System.out.println(count);
            count = count + 2;
        }
        System.out.println("Все стопе, зупинись...");
    }
}