package main;

import java.util.Random;

public class Exemplu2 {

  public static void main(String[] args) {

    ValueGenerator g1 = () -> 10;
    ValueGenerator g2 = () -> new Random().nextInt();
    ValueGenerator g3 = () -> g1.generate() * 2;


  }
}
