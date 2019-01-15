package AbstractFactory;

class App {
  public static void main(String[] args) {
    Kingdom kingdom = new Kingdom(KingdomFactory.select(KingdomType.ORC));
    King king = kingdom.getKing();
    Army army = kingdom.getArmy();
    System.out.println("King: "+king.getName() +"\n"+
        "Army: "+army.getName());
  }
}
