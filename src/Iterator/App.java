package Iterator;

class App {
  public static void main(String[] args) {
    Treasury treasury = new OrcTreasury();
    Iterator iterator = treasury.getIterator(ItemType.GOLD);
    while (iterator.hasNext()) {
      if (iterator.equals()) {
        System.out.println(iterator.next().getName());
      }
      iterator.next();
    }
  }
}
