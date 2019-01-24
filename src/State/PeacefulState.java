package State;

class PeacefulState implements State {
  private Orc orc;

  PeacefulState(Orc orc) {
    this.orc = orc;
  }

  @Override
  public void action() {
    System.out.println("Orc lies on the sun");
    orc.changeState();
  }
}
