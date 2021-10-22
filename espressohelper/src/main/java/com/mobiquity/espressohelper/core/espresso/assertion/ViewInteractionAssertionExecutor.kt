package com.mobiquity.espressohelper.core.espresso.assertion

import com.mobiquity.espressohelper.core.espresso.action.EspressoOperationExecutor

open class ViewInteractionAssertionExecutor(
    val assertion: EspressoAssertion
) : EspressoOperationExecutor(assertion)