package com.iict.model

import com.iict.services.State

/**
 * This class is a part of the package com.iict.model and the package
 * is a part of the project workflow.
 *
 * Semantro/Integrated ICT Pvt. Ltd. Lalitpur, Nepal.
 * https://integratedict.com.np/
 * https://semantro.com/
 *
 * Created by santa on 2024-02-25.
 * https://github.com/santabasnet
 */
type HexCode = String

/** Input value for the state change. */
case class ClientInput(id: HexCode, name: String, action: State)


