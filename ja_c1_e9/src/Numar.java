import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Numar {

  private ReadWriteLock lock = new ReentrantReadWriteLock();
  private int i;

  public int read() {
    try {
      lock.readLock().lock();
      return i;
    } finally {
      lock.readLock().unlock();
    }
  }

  public void increment() {
    try {
      lock.writeLock().lock();
      i++;
    } finally {
      lock.writeLock().unlock();
    }
  }
}
