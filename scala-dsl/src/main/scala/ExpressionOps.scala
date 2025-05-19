implicit class ExpressionOps(val v: Any) {

  def is(value: Any): Boolean = {
    v.equals(value)
  }

  def and(value: Boolean): Boolean = {
    v.equals(true) && value.equals(true)
  }

  def or(value: Boolean): Boolean = {
    v.equals(true) || value.equals(true)
  }
}
