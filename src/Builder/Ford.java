package Builder;

class Ford extends CarBuilder{

  Ford() {
    super();
  }

  @Override
  void setColour() {
    car.setColour("black");
  }

  @Override
  void setSpeed() {
    car.setSpeed(180);
  }
}
