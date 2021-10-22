package com.mobiquity.kotlinespressorecipe.data.loaders

import com.mobiquity.kotlinespressorecipe.data.entities.Message
import com.mobiquity.kotlinespressorecipe.data.repositories.MESSAGES

open class MessageLoader{
    open fun load() : ArrayList<Message>{
        return MESSAGES
    }
}