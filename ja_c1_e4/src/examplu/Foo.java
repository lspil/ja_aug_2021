package examplu;

import annotations.Aleator;
import annotations.Apeleaza;

public class Foo {

  @Aleator(value = 5)
  private int x;

  private int y;

  @Aleator(value = 10)
  private int z;

  @Apeleaza
  public void add() {
    System.out.println(x + y + z);
  }


  public void multiply() {
    System.out.println(x * y * z);
  }
}
