package com.iict.services

/**
 * This class is a part of the package com.iict.services and the package
 * is a part of the project workflow.
 *
 * Semantro/Integrated ICT Pvt. Ltd. Lalitpur, Nepal.
 * https://integratedict.com.np/
 * https://semantro.com/
 *
 * Created by santa on 2024-02-25.
 * https://github.com/santabasnet
 */

/** Main Workflow definition. */
trait Workflow[FlowState] {
    extension (source: FlowState)
        def transition[FlowInput](input: FlowInput): Option[FlowState]
}

/** A Demand Workflow definition. */
given Workflow[WorkflowDemand] with
    extension (demandState: WorkflowDemand)
        def transition[DemandValueInput](input: DemandValueInput)
        : Option[WorkflowDemand] = demandState match {
            case startState: DemandStart => input match
                case issueDemand: DemandInput => startState.transitionWith(issueDemand)

            case demandIssued: DemandIssued => input match
                case updateDemand: DemandInput => demandIssued.transitionWith(updateDemand)
        }

