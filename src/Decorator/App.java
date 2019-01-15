package Decorator;

class App {

  public static void main(String[] args) {
    Element element = new Colour(new Border(new Window()));
    element.draw();
  }
}
