package com.mobiquity.kotlinespressorecipe.pages

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mobiquity.espressohelper.page.Page
import com.mobiquity.kotlinespressorecipe.R

object UiElementsPage : Page<UiElementsPage>() {
    val button = withId(R.id.button1)
    val eventStatus = withId(R.id.last_event_status)
    val radioVisibleButton = withId(R.id.radio_visible)
    val radioInvisibleButton = withId(R.id.radio_invisible)
    val radioGoneButton = withId(R.id.radio_gone)
    val checkBoxClickable = withId(R.id.checkbox_clickable)
    val checkBoxEnabled = withId(R.id.checkbox_enable)
    val checkBoxSelected = withId(R.id.checkbox_selected)
    val checkBoxFocusable = withId(R.id.checkbox_focusable)
    val checkBoxJsEnabled = withId(R.id.checkbox_js_enabled)
    val editTextContentDesc = withId(R.id.et_contentDesc)
    val webView = withId(R.id.webview)
    val appCompatTextView = withId(R.id.app_compat_text)
    val imageView = withId(R.id.image_view)
    val emptyImageView = withId(R.id.empty_image_view)
}