package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = new int[3];
        int timeCharIndexInString = 0;

        for (int index = 0; index <= 2; index++) {
            timeInt[index] = Converter.convertCharsToInt(time, timeCharIndexInString);
            timeCharIndexInString += 3;
        }

        return processingSeconds(timeInt[2])
                + processingFiveHrs(timeInt[0])
                + processingSingleHrs(timeInt[0])
                + processingFiveMinutes(timeInt[1])
                + processingSingleMinutes(timeInt[1]);
    }

    private String processingSeconds(int secondsInt) {
        return EngineBerlinClock.convertSeconds(secondsInt);
    }

    private String processingFiveHrs(int hoursInt) {
        return EngineBerlinClock.convertFiveHrs(hoursInt);
    }

    private String processingSingleHrs(int hoursInt) {
        return EngineBerlinClock.convertIntToHoursOrMinutesString(hoursInt, Flag.HOURS);
    }

    private String processingFiveMinutes(int minutesInt) {
        return EngineBerlinClock.fiveMinutesLightBuilder(minutesInt);
    }

    private String processingSingleMinutes(int minutesInt) {
        return EngineBerlinClock.convertIntToHoursOrMinutesString(minutesInt, Flag.MINUTES);
    }
}
