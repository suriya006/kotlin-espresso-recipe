package com.mobiquity.espressohelper.core.espresso.action

import androidx.test.espresso.ViewAction
import com.mobiquity.espressohelper.core.common.Operation
import com.mobiquity.espressohelper.core.common.OperationType

interface EspressoAction : Operation {
    val viewAction: ViewAction
    override val name: String
    override val type: OperationType
    override val description: String
    override val timeoutMs: Long
}