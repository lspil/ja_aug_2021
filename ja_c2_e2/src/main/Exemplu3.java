package main;

public class Exemplu3 {

  public static void main(String[] args) {
    int x = 10; // int, String, char, enum
    int y;

//    switch (x) {
//      case 1:
//      case 2:
//        y = 100;
//        break;
//      case 3:
//        y = 200;
//        break;
//      default:
//        y = 300;
//    }

    y = switch (x) {
      case 1, 2 -> 100;
      case 3 -> 200;
      default -> 300;
    };

    y = switch (x) {
      case 1, 2: yield 100;
      case 3: yield 200;
      default: yield 300;
    };

    switch (x) {
      case 1, 2, 3:
        System.out.println(":)");
        break;
      case 4:
        System.out.println(":)");
        break;
    }
  }
}
