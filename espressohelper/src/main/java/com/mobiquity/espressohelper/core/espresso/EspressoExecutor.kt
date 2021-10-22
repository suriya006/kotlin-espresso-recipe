package com.mobiquity.espressohelper.core.espresso

import com.mobiquity.espressohelper.core.common.Operation

interface EspressoExecutor {
    fun execute() : EspressoOperationResult
    fun getOperation() : Operation
}