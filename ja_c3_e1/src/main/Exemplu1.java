package main;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exemplu1 {

  public void m() {
    NavigableSet<Integer> set = new TreeSet<>();
    n(set);
  }

  public void n(Set<Integer> set) {
    // set este sortat
  }

}
