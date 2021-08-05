public class Bar {

  private Bar() {}

  private static final class SingletonHolder {
    private static final Bar INSTANCE = new Bar();
  }

  public static Bar getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
