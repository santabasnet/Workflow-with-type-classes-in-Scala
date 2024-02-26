package com.iict.services

import com.iict.model.ClientInput

/**
 * This class is a part of the package com.iict.services and the package
 * is a part of the project workflow.
 *
 * Semantro/Integrated ICT Pvt. Ltd. Lalitpur, Nepal.
 * https://integratedict.com.np/
 * https://semantro.com/
 *
 * Created by santa on 2024-02-26.
 * https://github.com/santabasnet
 */

/** A state data instance for the WorkflowDemand. */
case class DemandStart() {
    def transitionWith(input: DemandInput) = Option.empty[WorkflowDemand]
}

/** Another state data instance for the WorkflowDemand. */
case class DemandIssued() {
    def transitionWith(input: DemandInput) = Option.empty[WorkflowDemand]
}

enum State {
    case MOVE, STOP, EXIT, HALT
}

/** The union type that represents all the states. */
type WorkflowDemand = DemandStart | DemandIssued

/** Then input type definition. */
type DemandInput = ClientInput
