package Semaphore1;

import java.util.concurrent.Semaphore;

class App {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(2);
    for (int t = 1; t<9; t++){
      Thread thread = new Thread(new Philisopher(t,semaphore));
      thread.start();
    }
  }
}
