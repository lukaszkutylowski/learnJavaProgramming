package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = Converter.convertCharsToInt(time);

        return Converter.convertSeconds(timeInt[2])
                + Converter.convertFiveHrs(timeInt[0])
                + convertSingleHrs(timeInt[0])
                + convertFiveMinutes(timeInt[1])
                + convertSingleMinutes(timeInt[1]);
    }

    private static String convertSingleHrs(int timeInt) {
        int multipleFiveHrs = timeInt % 5;
        return Converter.convertIntToString(multipleFiveHrs, 'H');
    }

    private String convertFiveMinutes(int timeInt) {
        int howMuchYellow = timeInt / 5;

        return Converter.fiveMinutesLightBulider(howMuchYellow);
    }

    private String convertSingleMinutes(int timeInt) {
        int mod = timeInt % 5;
        return Converter.convertIntToString(mod, 'M');
    }
}
