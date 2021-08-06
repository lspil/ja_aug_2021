package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu14 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "CCC", "AAA", "DDDD", "B", "AA", "BB", "C", "Q", "EEE");

    // [1 = [B,C,Q], 2 = [AA, BB], 3 = [CCC,AAA,EEE], 4 = [DDDD]]

    Map<Integer, List<String>> res =
      list.stream()
          .collect(Collectors.groupingBy(s -> s.length()));

    System.out.println(res);
  }
}
