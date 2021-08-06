package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu8 {

  public static void main(String[] args) {
    // x -> System.out.println(x);    System.out::println
    // x -> x.m();    X::m

    List<List<Integer>> list =
        Arrays.asList(
            Arrays.asList(1,4,5),
            Arrays.asList(3,1,2,1),
            Arrays.asList(1));
    // 18

//    int sum =
//      list.stream() // [[1,4,5],[3,1,2,1],[1]]
//          .flatMap(List::stream) // [1,4,5,3,1,2,1,1]
//          .reduce(0, (a,b) -> a + b);
//
//    System.out.println(sum);

//    int sum =
//        list.stream()
//            .flatMap(List::stream)
//            .collect(Collectors.summingInt(x -> x));

    int sum =
        list.stream()
            .flatMapToInt(e -> e.stream().mapToInt(x -> x))
            .reduce(0, (a,b) -> a + b);

    System.out.println(sum);
  }
}
