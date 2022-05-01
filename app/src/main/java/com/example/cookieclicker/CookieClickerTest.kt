package com.example.cookieclicker

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CookieClickerTest {
    @Rule
    var activityTestRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun totalStartsAtZero() {
        onView(withId(R.id.lblTotal)).check(matches(withText("0")))
    }

    @Test
    @Throws(java.lang.Exception::class)
    fun totalIncreasesWhenCookieClicked() {
        onView(withId(R.id.imgCookie))
            .perform(click())
        onView(withId(R.id.lblTotal))
            .check(matches(withText("1")))
    }

    @Test
    @Throws(java.lang.Exception::class)
    fun achieveHighScore() {
        for (i in 0..99) {
            onView(withId(R.id.imgCookie))
                .perform(click())
        }
        onView(withId(R.id.lblTotal))
            .check(matches(withText("100")))
    }

}
