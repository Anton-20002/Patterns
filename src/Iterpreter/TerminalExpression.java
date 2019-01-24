package Iterpreter;

class TerminalExpression implements Expression {
  private String string;

  TerminalExpression(String string) {
    this.string = string;
  }


  @Override
  public boolean iterpret(String context) {
    return context.contains(string);
  }
}
