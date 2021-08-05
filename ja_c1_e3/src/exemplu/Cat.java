package exemplu;

public class Cat {

  private String name;

  private Cat() {}

  private void sayMeow() {
    System.out.println("Meow! My name is " + name);
  }

  private void sayMeow(String name) {
    System.out.println("Meow! My name is " + name);
  }

}
