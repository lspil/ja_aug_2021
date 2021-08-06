package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu13 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("CCC", "AAA", "DDDD", "B");

    String res =
      list.stream()
          .sorted()
          .collect(Collectors.joining());

    System.out.println(res);
  }
}
