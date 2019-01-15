package Decorator;

class Border extends Decorator{

  public Border(Element element) {
    super(element);
  }

  @Override
  void afterDraw() {
    System.out.println("border drawing ...");
  }
}
