package main;

import java.util.List;

public class Exemplu21 {

  public static void main(String[] args) {
    List<Cat> cats = List.of(
        new Cat("Leo", 2),
        new Cat("Tom", 4),
        new Cat("Kitty", 1)
    );

    cats.stream()
//        .sorted()
        .sorted((c1,c2) -> c2.getAge() - c1.getAge())
        .forEach(c -> System.out.println(c.getName() + " " + c.getAge()));

  }
}
