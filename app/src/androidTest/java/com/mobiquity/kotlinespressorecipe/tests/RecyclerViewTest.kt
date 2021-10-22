package com.mobiquity.kotlinespressorecipe.tests

import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.mobiquity.espressohelper.extensions.assertMatches
import com.mobiquity.espressohelper.extensions.hasText
import com.mobiquity.espressohelper.extensions.isDisplayed
import com.mobiquity.espressohelper.extensions.isEnabled
import com.mobiquity.espressohelper.recyclerview.withRecyclerView
import com.mobiquity.kotlinespressorecipe.activity.MainActivity
import com.mobiquity.kotlinespressorecipe.data.repositories.CONTACTS
import com.mobiquity.kotlinespressorecipe.pages.FriendsListPage
import org.junit.Assert
import org.junit.Test

class RecyclerViewTest : BaseTest() {
    init {
        ruleSequence.addLast(ActivityTestRule(MainActivity::class.java))
    }
    val page = FriendsListPage

    @Test
    fun testDisplayedItemPositions() {
        for (index in 0..3) {
            withRecyclerView(page.friendsRecycler).atPosition(index)
                .assertMatches(hasDescendant(withText(CONTACTS[index].name)))
                .assertMatches(hasDescendant(withText(CONTACTS[index].status)))
                .isDisplayed()
        }
    }

    @Test
    fun testListSize(){
        val actualSize = withRecyclerView(page.friendsRecycler).getSize()
        Assert.assertEquals(CONTACTS.size, actualSize)
    }

    @Test
    fun getRecyclerViewTest(){
        val view = withRecyclerView(page.friendsRecycler).getRecyclerViewList()
        Assert.assertNotNull(view)
        Assert.assertEquals(Visibility.VISIBLE.value, view?.visibility)
    }

    @Test
    fun scrollToItemTest(){
        val contact = CONTACTS[CONTACTS.size - 1]
        val item = page.getFriendsListItem(contact.name)
        item.isDisplayed()
        item.name.hasText(contact.name)
        item.status.hasText(contact.status)
    }

    @Test
    fun recyclerViewItemClassTest(){
        val contact = CONTACTS[1]
        with(page.getFriendsListItem(contact.name)){
            this.isDisplayed().isClickable()
            this.name.isDisplayed().isEnabled().hasText(contact.name)
            this.status.isDisplayed().isEnabled().hasText(contact.status)
        }
    }
}
