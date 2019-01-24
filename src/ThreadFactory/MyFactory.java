package ThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

class MyFactory implements ThreadFactory {
  private int count=1;
  private List<String> values = new ArrayList<>();
  @Override
  public Thread newThread(Runnable r) {
    String name = "Thread";
    Thread thread = new Thread(r, name +" ("+count+")");
    count++;
    values.add(thread.getName());
    return thread;
  }

  List<String> getValues() {
    return values;
  }
}
