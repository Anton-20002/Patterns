package Decorator;

abstract class Decorator implements Element{
  private Element element;

  Decorator1(Element element) {
    this.element = element;
  }

  abstract void afterDraw1();
@Override
  public void draw() {
    element.draw();
    afterDraw();
  }

}
