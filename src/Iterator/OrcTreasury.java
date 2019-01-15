package Iterator;

import java.util.ArrayList;
import java.util.List;

public class OrcTreasury implements Treasury {
  private List<Item> orcsItems;
  OrcTreasury() {
    orcsItems = new ArrayList<Item>();
    orcsItems.add(new Item("Gold Ring", ItemType.GOLD));
    orcsItems.add(new Item("Axe", ItemType.WEAPON));
    orcsItems.add(new Item("Spear", ItemType.WEAPON));
    orcsItems.add(new Item("Gold Hat", ItemType.GOLD));
    orcsItems.add(new Item("Pallanga", ItemType.WEAPON));

  }
  @Override
  public Iterator getIterator(ItemType type) {
    return new TreasuryIterator(this, type);
  }


  @Override
  public List<Item> getList() {
    return orcsItems;
  }
}
