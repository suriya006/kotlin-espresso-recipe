package com.mobiquity.espressohelper.recyclerview

import android.view.View
import org.hamcrest.Matcher

interface RecyclerViewItemExecutor {
    fun scrollToItem()
    fun getItemMatcher(): Matcher<View>
    fun getItemChildMatcher(childMatcher: Matcher<View>): Matcher<View>
}