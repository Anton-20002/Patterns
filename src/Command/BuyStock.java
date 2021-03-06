package Command;

 class BuyStock implements Order {
  private Stock stock;

  BuyStock(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.buyStock();
  }
}
