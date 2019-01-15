package Decorator;

class Text implements Element {
  @Override
  public void draw() {
    System.out.println("text drawing ...");
  }
}
