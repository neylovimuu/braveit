package my.example;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Test {
    public static void main(String[] args) {
        System.out.println(Random.from(RandomGenerator.getDefault()) );
    }
}
