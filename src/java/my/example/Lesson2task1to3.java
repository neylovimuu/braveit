package my.example;

public class Lesson2task1to3 {
    public static void main(String[] args) {
      //int
      int int10 = 3;
      int int16 = 0x4;
      int int2 = 0b100;
      int int8 = 012;
      int sumInt = int2 + int10 + int16 + int8;
      System.out.println("sumInt=" + sumInt);

      //byte
      byte one = 1;
      byte two = 2;
      byte ten8 = 012;
      int sumByte = one + two + ten8;
      System.out.println("sumByte=" + sumByte);

      //long
      long long10 = 3L;
      long long16 = 0x10L;
      long long2 = 0b100L;
      long long8 = 012;
      long sumLong = long2 + long10 + long16 +long8;
      System.out.println("sumLong=" + sumLong);

      //double
      double double10 = 25.45;
      double double16 = 0x12P2;
      double double8 = 012;
      double sumDouble = double10 + double16 + double8;
      System.out.println("sumDouble=" + sumDouble);

      //float
      float float10 = 123f;
      float float16 = 0xFP-2F;
      float float8 = 012;
      float sumFloat = float10 + float16 + float8;
      System.out.println("sumFloat=" + sumFloat);

      //char
      char char1 = 10;
      char char2 = 64525;
      char char3 = 012;
      char char4 = 'B';
      int sumChar = char1 + char2 + char3 +char4;
      System.out.println("sumChar=" + sumChar);

      //Сума всіх чисел
      double longResult = sumInt + sumDouble + sumLong + sumFloat + sumChar + sumByte;
      System.out.println("sumLongResult=" + longResult);

    }
}
