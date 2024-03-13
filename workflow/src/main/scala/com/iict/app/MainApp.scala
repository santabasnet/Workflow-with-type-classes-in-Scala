package com.iict.app

import com.iict.model.ClientInput
import com.iict.services.{DemandService, DemandStart, State, WorkflowDemand}

/**
 * This class is a part of the package com.iict and the package
 * is a part of the project workflow.
 *
 * Semantro/Integrated ICT Pvt. Ltd. Lalitpur, Nepal.
 * https://integratedict.com.np/
 * https://semantro.com/
 *
 * Created by santa on 2024-02-25.
 * https://github.com/santabasnet
 */
object MainApp extends App {

    /** An instance of client input, possibly from the input from client request. */
    private val input1 = ClientInput("6ABE", "John Doe", State.MOVE)
    private val start =  DemandService.create(input1)
    println("Create Instance Through Transition: \n" + start)

    private val input2 = ClientInput("AABF", "John Doe", State.STOP)
    private val update = DemandService.update(input2)
    println("Update Instance Through Transition: \n" + update)
}
