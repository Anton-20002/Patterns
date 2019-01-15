package Factory;

class HumanFactory implements Blacksmith {
  @Override
  public String makeWeapon() {
    return "Human Weapon";
  }

  @Override
  public String makeTreasury() {
    return "Human Treasury";
  }
}
