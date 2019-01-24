package MVC;

class View {

  void display(Model model) {
    System.out.println("Nourishment " + model.getNourishment().toString() + "\n" + "Fatigue " + model.getFatugue() + "\n" + "Healthy " + model.getStatus());
  }

}
