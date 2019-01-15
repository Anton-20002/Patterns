package AbstractFactory;

public class OrcFactory implements KingdomFactory {
  @Override
  public King getKing() {
    return new OcrKing();
  }

  @Override
  public Army getArmy() {
    return new OrcArmy();
  }
}
