package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = new int[3];
        int timeCharPosition;

        for(int i = 0; i <= 2; i++) {
            if(i == 2) { timeCharPosition = 6; }
            else if(i == 1) { timeCharPosition = 3; }
            else { timeCharPosition = 0; }
            timeInt[i] = Converter.convertCharsToInt(time, timeCharPosition);
        }

        return processingSeconds(timeInt[2])
                + processingFiveHrs(timeInt[0])
                + processingSingleHrs(timeInt[0])
                + processingFiveMinutes(timeInt[1])
                + processingSingleMinutes(timeInt[1]);
    }

    private String processingSeconds(int secondsInt) {
        return Engine.convertSeconds(secondsInt);
    }

    private String processingFiveHrs(int hoursInt) {
        return Engine.convertFiveHrs(hoursInt);
    }

    private String processingSingleHrs(int hoursInt) {
        return Engine.convertIntToLights(hoursInt, 'H');
    }

    private String processingFiveMinutes(int minutesInt) {
        return Engine.fiveMinutesLightBulider(minutesInt);
    }

    private String processingSingleMinutes(int minutesInt) {
        return Engine.convertIntToLights(minutesInt, 'M');
    }
}
