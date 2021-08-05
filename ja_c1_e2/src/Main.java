import java.util.ArrayList;
import java.util.List;

public class Main {

  private static List<Cat> list = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    for (;;) {
      Thread.sleep(50);
      list.add(new Cat());
    }
  }
}
