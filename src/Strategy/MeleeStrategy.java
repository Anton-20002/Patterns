package Strategy;

public class MeleeStrategy implements DragonKillStrategy{


  @Override
  public void kill() {
    System.out.println("Get sword and hit dragon");
  }
}
