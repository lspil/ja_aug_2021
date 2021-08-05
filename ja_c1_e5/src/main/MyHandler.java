package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

  @Override
  public Object invoke(Object proxy,
                       Method method,
                       Object[] args) throws Throwable {
    if(method.getName().equals("eat")) {
      System.out.println(":(");
    } else {
      System.out.println(":)");
    }

    return null;
  }
}
