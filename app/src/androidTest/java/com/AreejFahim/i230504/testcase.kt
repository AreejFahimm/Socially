package com.AreejFahim.i230504


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.AreejFahim.i230504.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class testcase {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val relativeLayout = onView(
            allOf(
                withId(R.id.splash),
                childAtPosition(
                    allOf(
                        withId(android.R.id.content),
                        childAtPosition(
                            withId(com.google.android.material.R.id.action_bar_root),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        relativeLayout.perform(click())

        val materialButton = onView(
            allOf(
                withId(R.id.loginbtn), withText("Log in"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.login_scroll),
                        0
                    ),
                    2
                )
            )
        )
        materialButton.perform(scrollTo(), click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.loginbtn), withText("Log in"),
                childAtPosition(
                    allOf(
                        withId(R.id.main),
                        childAtPosition(
                            withId(android.R.id.content),
                            0
                        )
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val appCompatImageView = onView(
            allOf(
                withId(R.id.search),
                childAtPosition(
                    allOf(
                        withId(R.id.bottombar),
                        childAtPosition(
                            withId(R.id.main),
                            2
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        pressBack()

        val appCompatImageView2 = onView(
            allOf(
                withId(R.id.notifs),
                childAtPosition(
                    allOf(
                        withId(R.id.bottombar),
                        childAtPosition(
                            withId(R.id.main),
                            2
                        )
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatImageView2.perform(click())

        pressBack()
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
