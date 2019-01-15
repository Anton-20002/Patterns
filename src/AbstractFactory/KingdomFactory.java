package AbstractFactory;



interface KingdomFactory {
  King getKing();

  Army getArmy();

  static KingdomFactory select(KingdomType type) {
    switch (type.getStr()) {
      case "human":
        return new HumanFactory();
      case "orc":
        return new OrcFactory();
        default:
          throw new RuntimeException("He выбрано королевство!");
    }
  }
}
