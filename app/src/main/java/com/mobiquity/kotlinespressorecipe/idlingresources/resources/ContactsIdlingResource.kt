package com.mobiquity.kotlinespressorecipe.idlingresources.resources

import com.mobiquity.kotlinespressorecipe.idlingresources.AbstractIdlingResource
import com.mobiquity.kotlinespressorecipe.idlingresources.Holder

class ContactsIdlingResource : AbstractIdlingResource(){
    companion object : Holder<ContactsIdlingResource>(::ContactsIdlingResource)
}
