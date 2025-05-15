package ast

sealed trait Status
case class To(f: Status, g: Status) extends Status
case class Const(value: String) extends Status
