package Factory;

class OrcFactory implements Blacksmith {
  @Override
  public String makeWeapon() {
    return "Orc Weapon";
  }

  @Override
  public String makeTreasury() {
    return "Orc Treasury";
  }
}
