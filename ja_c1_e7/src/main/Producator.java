package main;

import java.util.Random;

public class Producator extends Thread {

  public Producator(String name) {
    super(name);
  }

  @Override
  public void run() {
    Random r = new Random();
    while (true) {
      try {
        synchronized (Main.list) {
          if (Main.list.size() < 100) {
            int x = r.nextInt();
            Main.list.add(x);
            System.out.println("Producatorul " + getName() + " a adaugat valoarea " + x);
            Main.list.notifyAll(); // notifica consumatorii
          } else {
            Main.list.wait(); // firul curent de ex astepta nedeterminat
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
