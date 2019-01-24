package Strategy;

class Killer {
  private DragonKillStrategy strategy;

  Killer(DragonKillStrategy strategy) {
    this.strategy = strategy;
  }

  void changeStrategy(DragonKillStrategy strategy) {
    this.strategy = strategy;
  }

  void attack() {
    strategy.kill();
  }

}
