import ast.{And, Expression, Is, Or, Var}

implicit class ExpressionOps(val v: Expression) {

  def is(value: Expression): Is = Is(v, Var(value))
  
  def and(value: Expression): And = And(v, Var(value))
  
  def or(value: Expression): Or = Or(v, Var(value))
  
}
