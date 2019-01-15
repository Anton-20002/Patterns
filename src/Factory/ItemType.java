package Factory;

enum ItemType {
  ORC("orc"), HUMAN("human");

  private String value;

  ItemType(String value) {
    this.value = value;
  }

  String getValue() {
    return value;
  }
}
