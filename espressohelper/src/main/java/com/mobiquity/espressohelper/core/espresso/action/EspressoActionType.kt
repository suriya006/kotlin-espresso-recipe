package com.mobiquity.espressohelper.core.espresso.action

import com.mobiquity.espressohelper.core.common.OperationType

enum class EspressoActionType :
    OperationType {
    CLICK, LONG_CLICK, DOUBLE_CLICK,
    TYPE_TEXT, REPLACE_TEXT, CLEAR_TEXT, PRESS_KEY, CLOSE_SOFT_KEYBOARD,
    SWIPE_LEFT, SWIPE_RIGHT, SWIPE_UP, SWIPE_DOWN, SCROLL, CUSTOM
}