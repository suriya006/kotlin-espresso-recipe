package com.mobiquity.espressohelper.listeners

import android.util.Log
import com.mobiquity.espressohelper.core.common.Operation
import com.mobiquity.espressohelper.core.common.OperationResult
import com.mobiquity.espressohelper.core.config.EspressoPageObjectConfig

class LogLifecycleListener : AbstractLifecycleListener() {
    override fun before(operation: Operation) {
        Log.d(
            EspressoPageObjectConfig.LOGCAT_TAG,
            "Before execution of ${operation.name}."
        )
    }

    override fun afterSuccess(operationResult: OperationResult) {
        Log.d(
            EspressoPageObjectConfig.LOGCAT_TAG,
            "Successfully executed ${operationResult.operation.name}."
        )
    }

    override fun afterFailure(operationResult: OperationResult) {
        Log.d(
            EspressoPageObjectConfig.LOGCAT_TAG, "Failed execution of ${operationResult.operation.name}, " +
                    "description: ${operationResult.resultDescription?.description}"
        )
    }
}