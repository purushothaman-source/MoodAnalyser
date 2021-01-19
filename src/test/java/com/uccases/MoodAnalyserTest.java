package com.uccases;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_ShouldReturn_ProperMood() {
        MoodAnalyser moodAnalyser=new  MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is sad message");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));

    }
}
