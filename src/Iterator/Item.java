package Iterator;



class Item {
  private String name;
  private ItemType type;

  Item(String name, ItemType type) {
    this.name = name;
    this.type = type;
  }

  String getName() {
    return name;
  }

  ItemType getType() {
    return type;
  }


}
