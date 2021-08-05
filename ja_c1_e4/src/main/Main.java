package main;

import annotations.Aleator;
import annotations.Apeleaza;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) throws Exception {
    String qName = "examplu.Foo";

    Class qFoo = Class.forName(qName);

    Constructor c = qFoo.getDeclaredConstructor();
    Object o = c.newInstance();

    Field[] allFields = qFoo.getDeclaredFields();
    for (Field f : allFields) {
      f.setAccessible(true);
      if (f.isAnnotationPresent(Aleator.class)) {
        Aleator a = f.getAnnotation(Aleator.class);
        f.set(o, a.value());
      }
    }

    Method[] allMethods = qFoo.getDeclaredMethods();
    for (Method m : allMethods) {
      m.setAccessible(true);
      if (m.isAnnotationPresent(Apeleaza.class)) {
        m.invoke(o);
      }
    }
  }
}
