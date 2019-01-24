package ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Data implements Runnable{
  private ReentrantLock lock = new ReentrantLock();
  private String name;
  Data(String name, ReentrantLock lock) {
    this.name = name;
    this.lock = lock;
  }

  @Override
  public void run() {
    boolean done = false;
    while (!done){


    boolean bool = lock.tryLock();
    if (bool){
      System.out.println("Data - "+name+" working...");
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }finally {
        lock.unlock();
        System.out.println("Data - "+name+" unblock");
        done = true;
      }
    } else {
      System.out.println("Data - " + name + " - wait unblock");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    }
  }
}
