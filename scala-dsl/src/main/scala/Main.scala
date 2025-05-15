import ast.Var

object Main {
  def main(args: Array[String]):Unit = {
    val role = Var("role")
    val voteCount = Var("voteCount")
    val region = Var("region")
    val lastLoginAt = Var("lastLoginAt")
    
    val workflow: WorkflowBuilder = new WorkflowBuilder();
    
    workflow.transition("A", "B").when(
      role is role
    )
  }
}
