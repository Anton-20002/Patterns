package AbstractFactory;


class Kingdom {
  private King king;
  private Army army;
  private KingdomFactory factory;

  Kingdom(KingdomFactory factory) {
    this.factory = factory;
    init();
  }

  private void init() {
    king = factory.getKing();
    army = factory.getArmy();
  }

  King getKing() {
    return king;
  }

  Army getArmy() {
    return army;
  }
}
