package Semaphore1;

import java.sql.Time;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Philisopher implements Runnable{
  private int id;
  private int num;//число приемов пищи
  private Semaphore semaphore;

  Philisopher(int id, Semaphore semaphore) {
    this.id = id;
    this.semaphore = semaphore;
  }

  @Override
  public void run() {
    while (num <= 2) {
      try {
        semaphore.acquire();
        System.out.println("Философ "+id+" садится за стол");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Филосов "+id+" выходит из-за стола");
        num++;
        semaphore.release();
        TimeUnit.SECONDS.sleep(1);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }
}
