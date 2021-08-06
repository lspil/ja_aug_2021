package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu9 {

  public static void main(String[] args) {
    // a e i o u
    List<String> list = Arrays.asList("abc", "qwerty", "qazwsx");
    // 3

    String vowels = "aeiouAEIOU";
    long c = list.stream()
        .flatMap(x -> Arrays.stream(x.split("")))
        .filter(x -> vowels.contains(x))
        .count();

    System.out.println(c);
  }
}
