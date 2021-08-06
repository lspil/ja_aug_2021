package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu10 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "qwerty", "qazwsx");

    List<String> res =
        list.stream()
            .filter(x -> x.length() % 2 == 0)
//            .peek(x -> System.out.println(x))
            .collect(Collectors.toList());

    //System.out.println(res);

//    List<String> res = new ArrayList<>();   // ASA NU!
//    list.stream()
//        .filter(x -> x.length() % 2 == 0)
//        .forEach(x -> res.add(x));
  }
}
