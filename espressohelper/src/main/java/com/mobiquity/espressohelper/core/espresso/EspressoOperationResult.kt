package com.mobiquity.espressohelper.core.espresso

import com.mobiquity.espressohelper.core.common.Operation
import com.mobiquity.espressohelper.core.common.OperationResult
import com.mobiquity.espressohelper.core.common.OperationResultDescription

class EspressoOperationResult(
    override val operation: Operation,
    override val success: Boolean,
    override val exception: Throwable? = null,
    override var resultDescription: OperationResultDescription? = null
) : OperationResult