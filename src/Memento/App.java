package Memento;

class App {
  public static void main(String[] args) {
    String str = "Hello World!!!";

    MementoKeeper mk = new MementoKeeper();
    MementoCatcher mc = new MementoCatcher(str);

    mk.setMemento(mc.setParToMemento());

    mc.getParFromMemento(mk.getMemento());
    System.out.println(mc.getVal());
  }
}
