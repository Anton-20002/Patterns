package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class App {
  public static void main(String[] args) {
    ReentrantLock lock = new ReentrantLock();
    for (int i=1; i<5; i++){
      Thread thread = new Thread(new Data("Thread: " + i,lock));
      thread.start();
    }
  }
}
