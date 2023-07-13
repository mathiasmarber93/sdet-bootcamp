package com.ti;

public class EnumExample {

    static final String FIRE_FOX = "webdriver.firefox";
    static final String CHROME = "webdriver.chrome";

    public static void main(String[] args){
        int today = WeekDays.WEDNESDAY.ranking;
        System.out.println(today);
        System.out.println(WeekDays.THURSDAY.event);

        System.out.println(selectBrowser(Browsers.CHROME));
    }

    private static String selectBrowser(Browsers b){
        String browserSelected = switch(b){
            case EDGE -> "Opening Egde";
            case CHROME -> "Opening chrome";
            case FIREFOX -> "Opening firefox";
            default -> "Bad option";
        };
        return browserSelected;
    }

}
