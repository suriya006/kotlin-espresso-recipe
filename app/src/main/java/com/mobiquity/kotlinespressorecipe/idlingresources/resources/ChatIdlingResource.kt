package com.mobiquity.kotlinespressorecipe.idlingresources.resources

import com.mobiquity.kotlinespressorecipe.idlingresources.AbstractIdlingResource
import com.mobiquity.kotlinespressorecipe.idlingresources.Holder

class ChatIdlingResource : AbstractIdlingResource(){
    companion object : Holder<ChatIdlingResource>(::ChatIdlingResource)
}