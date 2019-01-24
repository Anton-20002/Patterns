package Command;

class App {
  public static void main(String[] args) {
    Stock abs = new Stock();
    BuyStock buyStock = new BuyStock(abs);
    SellStock sellStock = new SellStock(abs);

    Brocker brocker = new Brocker();
    brocker.takeOrder(buyStock);
    brocker.takeOrder(sellStock);
    brocker.sellOrder();
  }
}
