package main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exemplu4 {

  public static void main(String[] args) {

    Numbers n1 = x -> {
      int sum = 0;
      for (int a : x) {
        sum += a;
      }
      return sum;
    };

    Numbers n2 = x ->
        //Arrays.stream(x).reduce(0, (a,b) -> a + b);
        //Arrays.stream(x).collect(Collectors.summingInt(a -> a));
        Arrays.stream(x).mapToInt(a -> a).sum();

    n1.apply(1,2,3,4,5,6);
    n1.apply(2,3,4);


  }
}
