package main;

import java.util.List;
import java.util.function.Predicate;

public class Exemplu20 {

  public static void main(String[] args) {
    List<String> list = List.of("ABC", "CED");

    list.stream()
        .filter(isOptionalForClient())
        .forEach(System.out::println);
  }

  private static Predicate<String> isOptionalForClient() {
    return x -> x.length() > 10 && x.length() < 3 && x.length() % 2 == 0;
  }
}
