import ast.{And, Expression, Is, IsNot, Var}

class WorkflowBuilder{

  def transition(current: String, before: String): ConditionBuilder = {
    val currentStatus: String = current
    val beforeStatus: String = before

    ConditionBuilder()
  }

  class ConditionBuilder{

    def when(expression: Expression): Unit = {

    }
  }

  def interpreter(expression: Expression): Boolean =
    expression match {
      case Var(value) => value.equals(true)
      case Is(f, g) => (f match
        case Var(value) => value
        case Is(f, g) => interpreter(f) == interpreter(g)
        case IsNot(f, g) => interpreter(f) != interpreter(g))
        .equals(g match
          case Var(value) => value
            case Is(f, g) => interpreter(f) == interpreter(g)
            case IsNot(f, g) => interpreter(f) != interpreter(g)
          )


    }
}