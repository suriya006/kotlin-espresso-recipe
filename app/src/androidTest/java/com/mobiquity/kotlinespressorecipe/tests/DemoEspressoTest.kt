package com.mobiquity.kotlinespressorecipe.tests

import androidx.test.rule.ActivityTestRule
import com.mobiquity.espressohelper.testlifecycle.setupteardown.SetUp
import com.mobiquity.espressohelper.testlifecycle.setupteardown.TearDown
import com.mobiquity.kotlinespressorecipe.activity.MainActivity
import com.mobiquity.kotlinespressorecipe.framework.Log
import com.mobiquity.kotlinespressorecipe.pages.ChatPage
import com.mobiquity.kotlinespressorecipe.pages.FriendsListPage
import org.junit.Test

class DemoEspressoTest : BaseTest() {
    companion object {
        const val FIRST_CONDITION = "FIRST_CONDITION"
        const val SECOND_CONDITION = "SECOND_CONDITION"
    }

    private val activityTestRule = ActivityTestRule(MainActivity::class.java)

    init {
        setupRule
            .addSetUp { Log.info("Common setup for all @Tests") }
            .addSetUp(FIRST_CONDITION) { Log.info("$FIRST_CONDITION setup, executed after common setup") }
            .addSetUp(SECOND_CONDITION) { Log.info("$SECOND_CONDITION setup") }
            .addSetUp { Log.info("Last common setup for all @Tests") }
            .addTearDown(FIRST_CONDITION) { Log.info("$FIRST_CONDITION teardowm executed before common teardowm") }
            .addTearDown { Log.info("Common tearDown for all @Tests") }
            .addTearDown(SECOND_CONDITION) { Log.info("$SECOND_CONDITION teardowm executed last") }
        ruleSequence.addLast(activityTestRule)
    }

    @Test
    fun friendsItemCheck() {
        FriendsListPage {
            assertName("Janice")
            assertStatus("Janice", "Oh. My. God")
        }
    }

    @SetUp(SECOND_CONDITION)
    @Test
    fun sendMessage() {
        Log.info("Start test sendMessage")
        FriendsListPage.openChat("Chandler Bing")
        ChatPage
            .clearHistory()
            .sendMessage("test message")
    }

    @SetUp(FIRST_CONDITION, SECOND_CONDITION)
    @TearDown(FIRST_CONDITION, SECOND_CONDITION)
    @Test
    fun checkMessagesPositionsInChat() {
        Log.info("Start test checkMessagesPositionsInChat")
        val firstMessage = "first message"
        val secondMessage = "second message"
        FriendsListPage.openChat("Janice")
        ChatPage {
            clearHistory()
            sendMessage(firstMessage)
            sendMessage(secondMessage)
            assertMessageTextAtPosition(0, firstMessage)
        }
    }
}