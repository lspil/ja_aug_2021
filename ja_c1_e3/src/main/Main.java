package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {
    String cName = "exemplu.Cat";
    try {
      Class catBp = Class.forName(cName);

      Constructor constructorCat = catBp.getDeclaredConstructor();
      constructorCat.setAccessible(true);

      Object o = constructorCat.newInstance();

      Field fName = catBp.getDeclaredField("name");
      fName.setAccessible(true);
      fName.set(o, "Tom");

      Method mMeow = catBp.getDeclaredMethod("sayMeow", String.class);
      mMeow.setAccessible(true);

      mMeow.invoke(o, "Leo"); // o.sayMeow()

      System.out.println(o);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}