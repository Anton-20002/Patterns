package Iterator;

 class TreasuryIterator implements Iterator {
   private int id = -1;
   private Treasury treasury;
   private ItemType type;

   TreasuryIterator(Treasury treasury, ItemType type) {
    this.treasury = treasury;
    this.type = type;
  }

  @Override
  public boolean hasNext() {
    return findId() !=-1;
  }

   private int findId() {
      int tempId = id;
          tempId++;
     if (treasury.getList().size() <= tempId) {
       id = -1;
       return -1;
     }

     id = tempId;
     return id;
   }

  @Override
  public boolean equals() {
    return treasury.getList().get(id).getType().equals(type);
  }

  @Override
  public Item next() {
    return treasury.getList().get(id);
  }
}
