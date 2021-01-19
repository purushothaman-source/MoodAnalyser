package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Im in sad mood ");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMessage_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
