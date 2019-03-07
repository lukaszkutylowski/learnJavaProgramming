package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = Converter.convertCharsToInt(time);

        return processingSeconds(timeInt[2])
                + processingFiveHrs(timeInt[0])
                + processingSingleHrs(timeInt[0])
                + processingFiveMinutes(timeInt[1])
                + convertSingleMinutes(timeInt[1]);
    }

    private String processingSeconds(int secondsInt) {
        int evenOrOdd = secondsInt % 2 > 0 ? 1 : 0;
        return Converter.convertSeconds(evenOrOdd);
    }

    private String processingFiveHrs(int hoursInt) {
        int howManyHrsLight = hoursInt / 5;
        return Converter.convertFiveHrs(howManyHrsLight);
    }

    private String processingSingleHrs(int hoursInt) {
        int multipleFiveHrs = hoursInt % 5;
        return Converter.convertIntToString(multipleFiveHrs, 'H');
    }

    private String processingFiveMinutes(int minutesInt) {
        int howMuchYellow = minutesInt / 5;
        return Converter.fiveMinutesLightBulider(howMuchYellow);
    }

    private String convertSingleMinutes(int timeInt) {
        int mod = timeInt % 5;
        return Converter.convertIntToString(mod, 'M');
    }
}
