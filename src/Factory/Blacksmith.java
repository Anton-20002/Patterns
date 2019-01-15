package Factory;

public interface Blacksmith {
  String makeWeapon();

  String makeTreasury();

  static Blacksmith select(ItemType type) {
    switch (type.getValue()){
      case "orc":
        return new OrcFactory();
      case "human":
        return new HumanFactory();
        default:
          throw new RuntimeException("Не выбран класс");
    }
  }
}
