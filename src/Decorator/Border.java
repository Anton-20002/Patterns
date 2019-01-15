package Decorator;

class Border extends Decorator{

  Border(Element element) {
    super(element);
  }

  @Override
  void afterDraw() {
    System.out.println("border drawing ...");
  }
}
