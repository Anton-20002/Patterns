package ReentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Main {
   public static void main(String[] args) {
     ReentrantLock lock = new ReentrantLock();
     ExecutorService pool = Executors.newFixedThreadPool(2);
     Runnable w1 = new Data( "Job1",lock);
     Runnable w2 = new Data( "Job2",lock);
     Runnable w3 = new Data( "Job3",lock);
     Runnable w4 = new Data( "Job4",lock);
     pool.execute(w1);
     pool.execute(w2);
     pool.execute(w3);
     pool.execute(w4);
     pool.shutdown();
   }
}
