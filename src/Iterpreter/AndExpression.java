package Iterpreter;

class AndExpression implements Expression{
  private Expression exp1;
  private Expression exp2;

  AndExpression(Expression exp1, Expression exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public boolean iterpret(String context) {
    return exp1.iterpret(context)&& exp2.iterpret(context);
  }
}
