package Decorator;

abstract class Decorator implements Element{
  private Element element;

  Decorator(Element element) {
    this.element = element;
  }

  abstract void afterDraw();
@Override
  public void draw() {
    element.draw();
    afterDraw();
  }

}
