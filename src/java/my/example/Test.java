package my.example;

public class Test {
    public static void main(String[] args) {
      //int
      int int10 = 3;
      int int16 = 0x4;
      int int2 = 0b100;
      int sumInt = int2+int10+int16;
      String a = "sumInt=";
      System.out.println(a+sumInt);

      //long
      long long10 = 3L;
      long long16 = 0x10L;
      long long2 = 0b100L;
      long sumLong = long2+long10+long16;
      String b = "sumLong=";
      System.out.println(b+sumLong);

      //double
      double double10 = 25.45;
      double double16 = 0x12P2;
      double sumDouble = double10+double16;
      String c = "sumDouble=";
      System.out.println(c+sumDouble);

      //float
      float float10 = 123f;
      float float16 = 0xFP-2F;
      float sumFloat = float10+float16;
      String d = "sumFloat=";
      System.out.println(d+sumFloat);

      //char
      char char1 = 10;
      char char2 = 64525;
      int sumChar = char1 + char2;
      String e = "sumChar=";
      System.out.println(e+sumChar);

      double longResult = sumInt+sumDouble+sumLong+sumFloat+sumChar;
      String f = "sumLongResult=";
      System.out.println(f+longResult);



    }
}
