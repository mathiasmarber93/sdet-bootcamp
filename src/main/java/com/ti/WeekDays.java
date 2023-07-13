package com.ti;

public enum WeekDays {
    MONDAY(2, "Work"),
    TUESDAY(4, "Go to park"),
    WEDNESDAY(6, "Play piano"),
    THURSDAY(8, "Play guitar"),
    FRIDAY(10,"Walk");

    final int ranking;
    final String event;

    WeekDays(int ranking, String event){
        this.ranking = ranking;
        this.event = event;
    }
}
