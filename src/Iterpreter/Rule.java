package Iterpreter;

class Rule {

  static Expression check() {
    TerminalExpression john = new TerminalExpression("John");
    TerminalExpression mark = new TerminalExpression("Mark");

    return new AndExpression(john, mark);
  }
}
