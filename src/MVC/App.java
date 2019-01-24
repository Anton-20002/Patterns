package MVC;

class App {
  public static void main(String[] args) {
    Model model = new Model(Nourishment.HUNGRY, Fatigue.ACTIVE, HealthStatus.HEALTHY);
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.updateView();
    controller.setModel(new Model(Nourishment.SATURATED, Fatigue.SLEEP, HealthStatus.HEALTHY));
    controller.updateView();
  }
}
