package MVC;

class Model {
  private Nourishment nourishment;
  private Fatigue fatugue;
  private HealthStatus status;

  Model(Nourishment nourishment, Fatigue fatugue, HealthStatus status) {
    this.nourishment = nourishment;
    this.fatugue = fatugue;
    this.status = status;
  }

  void setModel(Nourishment nourishment, Fatigue fatugue, HealthStatus status){
    this.nourishment = nourishment;
    this.fatugue = fatugue;
    this.status = status;
  }

  Nourishment getNourishment() {
    return nourishment;
  }

  Fatigue getFatugue() {
    return fatugue;
  }

  HealthStatus getStatus() {
    return status;
  }
}
