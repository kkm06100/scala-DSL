class WorkflowBuilder{

  def transition(current: String, before: String): ConditionBuilder = {
    val currentStatus: String = current
    val beforeStatus: String = before

    ConditionBuilder()
  }

  class ConditionBuilder{
    
  }
}