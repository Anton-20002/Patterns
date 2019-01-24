package State;

class Orc {
  private State state;
  Orc() {
    state = new AngryState(this);
    state.action();
  }

  void timePass() {
    state.action();
  }

  void changeState() {
    if (state.getClass().getSimpleName().equals("AngryState")) {
      setState(new PeacefulState(this));
    }else{
      setState(new AngryState(this));
    }

  }

  private void setState(State state) {
    this.state = state;
  }


}
