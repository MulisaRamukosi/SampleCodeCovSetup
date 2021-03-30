package com.puzzle.industries.samplecodecovsetup;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> scenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void clickButton_stateFalse_stateTrue(){

        scenarioRule.getScenario().onActivity(activity -> {
           activity.binding.btnTest.performClick();
        });
    }

}