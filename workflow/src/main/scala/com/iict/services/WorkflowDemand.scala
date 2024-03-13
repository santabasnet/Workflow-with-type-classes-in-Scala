package com.iict.services

import scala.util.Try
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
    def transitionWith(input: DemandInput) = {
        val newOutput = Try(DemandIssued("Started..")).toOption
        val output = s"Start with ${input.toString} to ${newOutput.toString}."
        println("\nOutput: " + output)
        newOutput
    }
}

/** Another state data instance for the WorkflowDemand. */
case class DemandIssued(argument: String) {
    def transitionWith(input: DemandInput) = {
        val newOutput = Try(DemandIssued("Issued Arguments")).toOption
        val output = s"Moved from $argument with ${input.toString} to ${newOutput.toString}."
        println("\nOutput: " + output)
        newOutput
    }
}

enum State {
    case MOVE, STOP, EXIT, HALT
}

/** The union type that represents all the states. */
type WorkflowDemand = DemandStart | DemandIssued

/** Then input type definition. */
type DemandInput = ClientInput
