package main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu2 {

  public static void main(String[] args) throws Exception {
    // Runnable vs Callable

    ExecutorService s = Executors.newCachedThreadPool();

    Callable<String> c = new Callable<String>() {
      @Override
      public String call() throws Exception {
        throw new RuntimeException(":(");
//        return "hello!";
      }
    };

    Future<String> promise = s.submit(c);

    // alte chestii

    try {
      String res = promise.get();
    } catch (ExecutionException e) {
      Throwable [] t = e.getSuppressed();
      for (Throwable x: t) {
        if (x.getClass().equals(ArrayStoreException.class)) {
          // retry
        }
      }
    }

//    System.out.println(res);
  }
}
