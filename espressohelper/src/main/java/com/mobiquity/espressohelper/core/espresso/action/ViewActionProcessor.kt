package com.mobiquity.espressohelper.core.espresso.action

import com.mobiquity.espressohelper.core.espresso.EspressoExecutor
import com.mobiquity.espressohelper.core.espresso.EspressoOperationResult

interface ViewActionProcessor {
    fun process(executor: EspressoExecutor) : EspressoOperationResult
}