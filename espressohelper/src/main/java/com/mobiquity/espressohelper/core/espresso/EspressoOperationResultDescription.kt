package com.mobiquity.espressohelper.core.espresso

import com.mobiquity.espressohelper.core.common.OperationResult
import com.mobiquity.espressohelper.core.common.OperationResultDescription

class EspressoOperationResultDescription(
    override val result: OperationResult,
    override val description: String
) : OperationResultDescription