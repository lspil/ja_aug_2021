package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplu18 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,3,5,7,9);
    Predicate<Integer> p1 = x -> x % 2 == 0;

    var e1 =
      list.stream()
          .filter(p1)
          .collect(Collectors.toList());

    var e2 =
        list.stream()
            .filter(x -> x % 2 == 0)
            .findAny();

    e2.ifPresentOrElse(
        x -> {},
        () -> {});

    e2.orElse(0);
    e2.orElseThrow(() -> new RuntimeException(":("));
    e2.map(x -> 2 * x).orElse(0);

    if (e2.isPresent()) {
      var x = e2.get(); // evita folosirea lui get()
    }

    boolean x1 = e2.isPresent();
    boolean x2 = e2.isEmpty();
    e2.ifPresent(x -> System.out.println(x));
    e2.ifPresentOrElse(x -> {}, () -> {});

  }
}
