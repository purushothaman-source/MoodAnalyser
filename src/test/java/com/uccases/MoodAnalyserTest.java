package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_ShouldReturn_ProperMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in sad Mood");
        Assert.assertEquals("SAD", mood);
    }
}
