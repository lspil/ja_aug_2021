package main;

import config.ProjectConfig;
import controllers.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
      var b1 = c.getBean(UserController.class);
      System.out.println(b1.getClass());
      System.out.println(b1.getN()); // 1000
    }
  }
}
