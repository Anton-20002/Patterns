package Strategy;

public class MagicStrategy implements DragonKillStrategy{

  @Override
  public void kill() {
    System.out.println("Light hit dragon");
  }
}
