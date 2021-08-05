package main;

public class Consumator extends Thread {

  public Consumator(String name) {
    super(name);
  }

  @Override
  public void run() {
    while(true) {
      try {
        synchronized (Main.list) {
          if (!Main.list.isEmpty()) {
            int x = Main.list.get(0);
            Main.list.remove(0);
            System.out.println("Consumatorul " + getName() + " a consumat valoarea " + x);
            Main.list.notifyAll(); // notifica producatorii
          } else {
            Main.list.wait();
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
