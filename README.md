# Workflow in Scala

Writing workflow with extension/implicit function in Scala-3.

## 1. Signature
  Contains main signature that can be derived to write/implement actual case of workflow. 

  ```scala
/** Main Workflow definition. */
trait Workflow[FlowState] {
    extension (source: FlowState)
        def transition[FlowInput](input: FlowInput): Option[FlowState]
}
```

## 2. Actions upon the data with create and update functionalities.

```scala
/** Make state change with the input data, possibly in the DB. */
    def create(input: ClientInput): Option[WorkflowDemand] =
        DemandStart().transition(input)

    /** Make state change to update the data possibly in the DB. */
    def update(input: ClientInput): Option[WorkflowDemand] =
        DemandIssued("Issued Arguments").transition(input)
```

## 3. Usage

```scala
object MainApp extends App {
    /** An instance of client input, possibly from the input from client request. */
    private val input1 = ClientInput("6ABE", "John Doe", State.MOVE)
    private val start =  DemandService.create(input1)
    println("Create Instance Through Transition: \n" + start)

    private val input2 = ClientInput("AABF", "John Doe", State.STOP)
    private val update = DemandService.update(input2)
    println("Update Instance Through Transition: \n" + update)
}
```
