package com.mobiquity.espressohelper.core.espresso.resultanalyzer

import com.mobiquity.espressohelper.core.common.OperationResult

class CheckOperationResultAnalyzer : EspressoOperationResultAnalyzer {
    override fun analyze(operationResult: OperationResult): Boolean {
        return operationResult.success
    }
}