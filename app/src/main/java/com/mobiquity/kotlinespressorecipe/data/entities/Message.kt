package com.mobiquity.kotlinespressorecipe.data.entities

data class Message(val authorId: Int,
                   val receiverId: Int,
                   val text: String)