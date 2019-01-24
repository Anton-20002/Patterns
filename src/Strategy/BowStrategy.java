package Strategy;

public class BowStrategy implements DragonKillStrategy {
  @Override
  public void kill() {
    System.out.println("Shoot arrow in dragon");
  }
}
