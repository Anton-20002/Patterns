package Factory;

class App {
  public static void main(String[] args) {
    Blacksmith blacksmith = Blacksmith.select(ItemType.HUMAN);
    System.out.println(blacksmith.makeTreasury());

  }
}
