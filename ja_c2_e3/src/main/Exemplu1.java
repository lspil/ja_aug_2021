package main;

public class Exemplu1 {


  public static void main(String[] args) {

    Executor e1 = new Executor() {
      @Override
      public void execute() {
        System.out.println(":)");
      }
    };

    Executor e2 = () -> System.out.println(":)");

    e1.execute(); // :)
    e2.execute(); // :)

  }
}
