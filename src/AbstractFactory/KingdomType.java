package AbstractFactory;

enum KingdomType {
  ORC("orc"), HUMAN("human");
  private String str;

  KingdomType(String str) {
    this.str = str;
  }

  public String getStr() {
    return str;
  }
}
