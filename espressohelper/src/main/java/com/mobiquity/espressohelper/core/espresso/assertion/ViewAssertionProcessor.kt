package com.mobiquity.espressohelper.core.espresso.assertion

import com.mobiquity.espressohelper.core.espresso.EspressoExecutor
import com.mobiquity.espressohelper.core.espresso.EspressoOperationResult

interface ViewAssertionProcessor {
    fun process(executor: EspressoExecutor): EspressoOperationResult
}