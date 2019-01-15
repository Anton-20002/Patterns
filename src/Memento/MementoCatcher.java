package Memento;

class MementoCatcher {
  private String val;

  MementoCatcher(String val) {
    this.val = val;
  }

  Memento setParToMemento() {
    return  new Memento(val);
      }

  void getParFromMemento(Memento memento) {
    this.val = memento.getValue();
  }

  String getVal() {
    return val;
  }
}
