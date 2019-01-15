package Builder;

class Creator {
  private CarBuilder builder;

  Creator(CarBuilder builder) {
    this.builder = builder;
  }

  Car createCar() {
    builder.buildCar();
    builder.setColour();
    builder.setSpeed();
    return builder.getCar();
  }

}
