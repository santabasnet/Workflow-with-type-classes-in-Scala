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
 * Created by santa on 2024-02-25.
 * https://github.com/santabasnet
 */
object DemandService {

    /** Make state change with the input data, possibly in the DB. */
    def create(input: ClientInput): Option[WorkflowDemand] =
        DemandStart().transition(input)

    /** Make state change to update the data possibly in the DB. */
    def update(input: ClientInput): Option[WorkflowDemand] =
        DemandIssued("Issued Arguments").transition(input)

}
