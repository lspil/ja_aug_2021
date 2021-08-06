package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu12 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("AAA", "B", "CCC", "DDDD");
    // 11

//    int sum = list.stream()
//        .collect(Collectors.summingInt(x -> x.length()));

//    int sum = list.stream()
//        .collect(Collectors.summingInt(String::length));

    int sum = list.stream()
        .map(x -> x.length())
        .collect(Collectors.summingInt(x -> x));

    System.out.println(sum);
  }
}
