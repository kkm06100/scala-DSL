package ast

import scala.annotation.targetName

sealed trait Expression

case class Var(value: Any) extends Expression
case class Not(f: Expression) extends Expression
case class Is(f: Expression, g: Expression) extends Expression
case class IsNot(f: Expression, g: Expression) extends Expression
case class And(f: Expression, g: Expression) extends Expression
case class Or(f: Expression, g: Expression) extends Expression
