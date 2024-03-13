# Workflow in Scala

Writing workflow with extension/implicit function in Scala-3.

## 1. Signature
  Contains main signature that can be derived to write/implement actual case of workflow. 

  ```
/** Main Workflow definition. */
trait Workflow[FlowState] {
    extension (source: FlowState)
        def transition[FlowInput](input: FlowInput): Option[FlowState]
}
```

## 2. Actions upon the data with create and update functionalities.

```
/** Make state change with the input data, possibly in the DB. */
    def create(input: ClientInput): Option[WorkflowDemand] =
        DemandStart().transition(input)

    /** Make state change to update the data possibly in the DB. */
    def update(input: ClientInput): Option[WorkflowDemand] =
        DemandIssued("Issued Arguments").transition(input)
```

