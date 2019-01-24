package Strategy;

class App {
  public static void main(String[] args) {
    Killer killer = new Killer(new MeleeStrategy());
    killer.attack();
    killer.changeStrategy(new MagicStrategy());
    killer.attack();
    killer.changeStrategy(new
        BowStrategy());
    killer.attack();
    killer.changeStrategy(new MagicStrategy());
    killer.attack();
  }
}
