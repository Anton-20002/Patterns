package State;

class AngryState implements State{
  private Orc orc;

  AngryState(Orc orc) {
    this.orc = orc;
  }

  @Override
  public void action() {
    System.out.println("Orc hunts on rabbits");
    orc.changeState();
  }
}
