package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu16 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "CCC", "AAA", "DDDD", "B", "AA", "BB", "C", "Q", "EEE");

    // [1 = 3, 2 = 4, 3 = 9, 4 = 4]

   var res =
     list.stream()
         .collect(Collectors.groupingBy(String::length,
                      Collectors.summingInt(x -> x.length())));

    System.out.println(res);
  }
}
