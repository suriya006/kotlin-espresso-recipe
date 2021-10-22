package com.mobiquity.espressohelper.core.espresso.resultanalyzer

import com.mobiquity.espressohelper.core.common.OperationResult

class DefaultOperationResultAnalyzer : EspressoOperationResultAnalyzer {
    override fun analyze(operationResult: OperationResult): Boolean {
        if (!operationResult.success && operationResult.exception != null) {
            throw operationResult.exception!!
        }
        return operationResult.success
    }
}