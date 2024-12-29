package com.nhan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    /**
     * @return
     */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }
}
