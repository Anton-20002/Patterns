package Iterator;

import java.util.List;

interface Treasury {
  List<Item> getList();

  Iterator getIterator(ItemType type);
}
