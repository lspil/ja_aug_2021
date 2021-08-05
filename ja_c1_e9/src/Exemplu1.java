import java.util.stream.Stream;

public class Exemplu1 {

  public static void main(String[] args) {
//    String name = Thread.currentThread().getName();
//    System.out.println(name);

    Stream.of(1,2,3,4,5,6,7,8,9)
        .peek(n -> System.out.println(Thread.currentThread().getName()))
        .forEach(System.out::println);
  }
}
