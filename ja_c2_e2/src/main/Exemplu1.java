package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exemplu1 {

  public static void main(String[] args) {
    List<ArrayList<Integer>> x = m();

    String s1 = """
        SELECT * FROM Product p, Client c 
        WHERE p.client = c.id AND p.expDate = ?
        ORDER BY c.id
        """;

    String s2 = "SELECT * FROM Product p, Client c " +
        "WHERE p.client = c.id AND p.expDate = ?" +
        "ORDER BY c.id";

    Product p = new Product(1, "Beer", "gold", LocalDate.now());
    int id = p.id();



  }

  public static List<ArrayList<Integer>> m() {
    return  new ArrayList<ArrayList<Integer>>();
  }
}
