package com.mobiquity.kotlinespressorecipe.framework.utils

import androidx.test.platform.app.InstrumentationRegistry

object TestDataUtils {
    fun getResourceString(resourceId: Int): String {
        return InstrumentationRegistry.getInstrumentation().targetContext.resources.getString(resourceId)
    }
}