package Command;

class Stock {
  private String name = "ABC";
  private int quantity = 10;

  void buyStock() {
    System.out.println("Stock "+name +" Quantity "+quantity+" bought.");
  }

  void sellStock() {
    System.out.println("Stock "+name +" Quantity "+quantity+" sold.");
  }
}
