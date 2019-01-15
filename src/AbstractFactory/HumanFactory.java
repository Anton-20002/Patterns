package AbstractFactory;

public class HumanFactory implements KingdomFactory {
  @Override
  public King getKing() {
    return new HumanKing();
  }

  @Override
  public Army getArmy() {
    return new HumanArmy();
  }
}
