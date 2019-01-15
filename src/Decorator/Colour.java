package Decorator;

class Colour extends Decorator {

  Colour(Element element) {
    super(element);
  }

  @Override
  void afterDraw() {
    System.out.println("colour add ...");
  }
}
