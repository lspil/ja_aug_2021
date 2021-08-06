package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplu7 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("AA", "DDD", "CC", "EEE", "B");
    // AABCCDDDEEE

    String res =
      list.stream()
          .sorted(Collections.reverseOrder())
          .reduce("", (a,b) -> a + b);

    System.out.println(res);
  }
}
