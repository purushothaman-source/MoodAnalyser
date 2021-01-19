package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in sad Mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenAnyMessage_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in any Mood");
        Assert.assertEquals("HAPPY", mood);
    }


}
