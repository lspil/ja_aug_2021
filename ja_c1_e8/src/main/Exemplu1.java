package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {

  public static void main(String[] args) {
    // ExecutorService & ScheduledExecutorService

    int n = Runtime.getRuntime().availableProcessors(); // cate culoare sunt
//    ExecutorService es =
//        Executors.newFixedThreadPool(n); // cati inotatori sunt

    ExecutorService es =
        Executors.newCachedThreadPool(); // cati inotatori sunt

    System.out.println(n);
    Runnable r = new Runnable() { // mingea
      @Override
      public void run() {
        System.out.println("HELLO");
      }
    };

    es.submit(r); // aruncam mingea in bazin

    es.shutdown();
  }
}
