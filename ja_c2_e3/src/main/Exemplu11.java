package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu11 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

    int sum =
      list.stream()
          .collect(Collectors.summingInt(x -> x));

    System.out.println(sum);
  }
}
