package MVC;

class Controller {
  private Model model;
  private View view;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  void updateView() {
    view.display(model);
  }

  Model getModel() {
    return model;
  }

  void setModel(Model model) {
    this.model = model;
  }

  View getView() {
    return view;
  }

  void setView(View view) {
    this.view = view;
  }
}
