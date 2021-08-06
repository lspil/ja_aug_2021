package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu15 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "CCC", "AAA", "DDDD", "B", "AA", "BB", "C", "Q", "EEE");

    // [1 = BCQ, 2 = AABB, 3 = CCCAAAEEE, 4 = DDDD]

   var res =
     list.stream()
         .collect(Collectors.groupingBy(String::length,
                      Collectors.joining()));

    System.out.println(res);
  }
}
