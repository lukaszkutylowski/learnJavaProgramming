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
        int evenOrOdd = secondsInt % 2 > 0 ? 1 : 0;
        return Engine.convertSeconds(evenOrOdd);
    }

    private String processingFiveHrs(int hoursInt) {
        int howManyHrsLight = hoursInt / 5;
        return Engine.convertFiveHrs(howManyHrsLight);
    }

    private String processingSingleHrs(int hoursInt) {
        int multipleFiveHrs = hoursInt % 5;
        return Engine.convertIntToLights(multipleFiveHrs, 'H');
    }

    private String processingFiveMinutes(int minutesInt) {
        int howMuchYellow = minutesInt / 5;
        int howMuchYYR = howMuchYellow / 3;
        return Engine.fiveMinutesLightBulider(howMuchYellow, howMuchYYR);
    }

    private String processingSingleMinutes(int minutesInt) {
        int mod = minutesInt % 5;
        return Engine.convertIntToLights(mod, 'M');
    }
}
