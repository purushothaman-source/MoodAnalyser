package com.uccases;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {

        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
            return "HAPPY";
        }
    }

    public String analyseMood(String message) throws MoodAnalyserException {

        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
             throw new MoodAnalyserException("Please Enter Proper Mood");
        }
    }
}
