package Decorator;

public class Colour extends Decorator {

  public Colour(Element element) {
    super(element);
  }

  @Override
  void afterDraw() {
    System.out.println("colour add ...");
  }
}
