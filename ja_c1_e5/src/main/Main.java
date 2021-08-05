package main;

import java.lang.reflect.Proxy;

public class Main {

  public static void main(String[] args) {
    //Eatable e1 = new Coke();

    Eatable e = (Eatable) Proxy.newProxyInstance(
        Main.class.getClassLoader(),
        new Class[] {Eatable.class},
        new MyHandler()
        );


    e.drink();
  }
}
