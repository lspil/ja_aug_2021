package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

  public static List<Integer> list = new ArrayList<>();
  public static Semaphore s = new Semaphore(1);

  public static void main(String[] args) {
    new Producator("P1").start();
    new Producator("P2").start();
    new Consumator("C1").start();
    new Consumator("C2").start();
  }

  public void m(List<Integer> list) {
    var sl = Collections.synchronizedList(list);

  }
}
