package Memento;

class MementoKeeper {
  private Memento memento;

  Memento getMemento() {
    return memento;
  }

  void setMemento(Memento memento) {
    this.memento = memento;
  }
}
