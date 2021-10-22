package com.mobiquity.kotlinespressorecipe.tests

import androidx.test.rule.ActivityTestRule
import com.mobiquity.kotlinespressorecipe.activity.UiElementsActivity
import com.mobiquity.kotlinespressorecipe.pages.UiElementsPage

abstract class UiElementsTest : BaseTest() {
    val activityRule = ActivityTestRule(UiElementsActivity::class.java)

    init {
        ruleSequence.add(activityRule)
    }

    val page = UiElementsPage
}