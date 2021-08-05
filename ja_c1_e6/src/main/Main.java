package main;

public class Main {

  public static void main(String[] args) {
    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        while (true) {
          System.out.println("HELLO");
        }
      }
    };
    Thread t1 = new Thread(r1);
    t1.start();


    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        while (true) {
          System.out.println("WORLD");
        }
      }
    };
    Thread t2 = new Thread(r2);
    t2.start();
  }
}
