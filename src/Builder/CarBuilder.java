package Builder;

abstract class CarBuilder {
  Car car;

  abstract void setColour();

  abstract void setSpeed();

  void buildCar() {
    car = new Car();
  }

  Car getCar() {
    return car;
  }
}
