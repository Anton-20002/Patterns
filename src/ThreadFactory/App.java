package ThreadFactory;

class App {
  public static void main(String[] args) {
    MyFactory factory = new MyFactory();
    Runnable task = new Task();
    Thread thread;
    for (int i = 1; i <= 10; i++) {
      thread = factory.newThread(task);
      thread.start();
    }
    factory.getValues().forEach(System.out::println);
  }
}
