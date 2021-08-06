package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu17 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "CCC", "AAA", "DDDD", "B", "AA", "BB", "C", "Q", "EEE");

    // [1 = 3, 2 = 4, 3 = 9, 4 = 4]

    /*
    forEach
    reduce
    sum
    collect
    count
     */
   var res =
     list.stream()
         .collect(Collectors.groupingBy(String::length,    // [1 = [B,C,Q], 2 = [AA, BB], 3 = [CCC,AAA,EEE], 4 = [DDDD]]
                      Collectors.mapping(s -> s.length(),  // [1 = [1,1,1], 2 = [2, 2], 3 = [3,3,3], 4 = [4]]
                          Collectors.summingInt(x -> x)))); // [1 = 3, 2 = 4, 3 = 9, 4 = 4]

    System.out.println(res);
  }
}
