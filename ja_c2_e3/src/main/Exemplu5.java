package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Exemplu5 {

  public static void main(String[] args) {

//    Stream.of(1,3,4,5,6,7)
//        .forEach(x -> System.out.println(x));

//    Stream.of(1,3,4,5,6,7) // [1,3,4,5,6,7]
//        .filter(x -> x % 2 == 0) // [4,6]
//        .forEach(x -> System.out.println(x));

//    Stream.of(1,3,4,5,6,7) // [1,3,4,5,6,7]
//        .map(x -> 2 * x) // [2,6,8,10,12,14]
//        .filter(x -> x % 2 == 0) // [2,6,8,10,12,14]
//        .map(x -> x - 1) // [1,5,7,9,11,13]
//        .forEach(x -> System.out.println(x));

    //Stream.of(1,2,3,4,5,6);
    //Stream.empty();

//    Stream.generate(() -> new Random().nextInt())
//        .limit(5)
//        .forEach(x -> System.out.println(x));

//    List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//    list.stream()
//        .filter(x -> x % 2 == 0)
//        .forEach(x -> System.out.println(x));

//    List<String> list = Arrays.asList("ABC", "AB", "ABCDE", "ABCD");
//    list.stream()
//        .filter(s -> s.length() % 2 == 0)
//        .forEach(x -> System.out.println(x));

    List<String> list = Arrays.asList("ABC", "AB", "ABCDE", "ABCD");
    list.stream()
        .filter(s -> s.length() % 2 == 0)
        .forEach(System.out::println);
  }
}
