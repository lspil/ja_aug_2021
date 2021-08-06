package main;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exemplu19 {

  public static void main(String[] args) {
    Predicate<Integer> p1 = x -> true;
    Predicate<String> p2 = x -> x.length() > 10;
    Predicate<String> p3 = x -> x.length() % 2 == 0;
    Predicate<String> p4 = x -> x.isEmpty();

    BiPredicate<String, Integer> bp1 = (x,y) -> x.length() == y;

    Function<String, Integer> f1 = x -> x.length();
    BiFunction<Integer, Integer, Integer> f2 = (x,y) -> x + y;

    Consumer<String> c1 = x -> System.out.println(x);
    BiConsumer<Integer, String> c2 = (x,y) -> System.out.println(x + y);

    Map<Integer, String> map1 = Map.of(1, "A", 2, "B");
    map1.forEach(c2);

  }
}
