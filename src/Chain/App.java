package Chain;

class App {
  public static void main(String[] args) {
    Chain comp1 = new Comonent1();
    Chain comp2 = new Component2();
    Chain comp3 = new Component3();

    comp1.setCh(comp2);
    comp2.setCh(comp3);

    comp1.getChain();
  }
}
