package com.mobiquity.kotlinespressorecipe.tests

import androidx.test.espresso.IdlingRegistry
import androidx.test.platform.app.InstrumentationRegistry
import com.mobiquity.espressohelper.testlifecycle.rulesequence.RuleSequence
import com.mobiquity.espressohelper.testlifecycle.setupteardown.SetUpTearDownRule
import com.mobiquity.kotlinespressorecipe.data.repositories.CURRENT_USER
import com.mobiquity.kotlinespressorecipe.framework.Log
import com.mobiquity.kotlinespressorecipe.idlingresources.resources.ContactsIdlingResource
import com.mobiquity.kotlinespressorecipe.managers.AccountManager
import org.junit.Rule

abstract class BaseTest {

    private val idlingRes = ContactsIdlingResource.getInstanceFromTest()

    val setupRule = SetUpTearDownRule()
        .addSetUp {
            Log.info("Login valid user")
            AccountManager(InstrumentationRegistry.getInstrumentation().targetContext).login(
                CURRENT_USER.login, CURRENT_USER.password
            )
        }.addSetUp {
            Log.info("Register idling resource")
            IdlingRegistry.getInstance().register(idlingRes)
        }.addTearDown {
            Log.info("Unregister idling resource")
            IdlingRegistry.getInstance().unregister(idlingRes)
        }

    @get:Rule
    open val ruleSequence = RuleSequence(setupRule)
}