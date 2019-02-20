package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    public String convertTime(String time) {
        int timeInt[] = new int[3];

        timeInt[0] = convertCharsToInt(time, time.charAt(0), time.charAt(1));
        timeInt[1] = convertCharsToInt(time, time.charAt(3), time.charAt(4));
        timeInt[2] = convertCharsToInt(time, time.charAt(6), time.charAt(7));

        final String seconds = convertSeconds(timeInt);
        final String fiveHrs = convertFiveHrs(timeInt);
        final String singleHrs = convertSingleHrs(timeInt);
        final String fiveMinutes = conversionFiveMinutes(timeInt);
        final String singleMinutes = convertSingleMinutes(timeInt);

        return seconds + fiveHrs + singleHrs + fiveMinutes + singleMinutes;
    }

    private int convertCharsToInt(String time, char first, char second) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(time.charAt(first));
        stringBuilder.append(time.charAt(second));

        return Integer.parseInt(stringBuilder.toString());
    }

    public String convertSeconds(int[] timeInt) {
        return timeInt[2] % 2 > 0 ? "O" : "Y";
    }

    public String convertFiveHrs(int[] timeInt) {
        if (timeInt[0] % 19 > 0) return "RRRR";
        else if (timeInt[0] % 14 > 0) return "RRRO";
        else if (timeInt[0] % 9 > 0) return "RROO";
        else if (timeInt[0] % 4 > 0) return "ROOO";
        else return "OOOO";
    }

    public String convertSingleHrs(int[] timeInt) {
        int modulo = timeInt[0] % 5;

        if(modulo <= 0) return "OOOO";
        else return convertIntToString(modulo,'H');
    }

    private String convertIntToString(int modulo, char flag){
        String light = "";

        for(int i = 1; i <= modulo; i++)
            if(flag =='H') light += "R";
            else light += "Y";

        while(light.length() < 4)
            light += "O";

        return light;
    }

    public String conversionFiveMinutes(int[] timeInt) {
        int timeQuarter = convertToQuarterTime(timeInt[1]);
        int numbersOfQuarter = timeInt[1] / 15;

        return initialLights(numbersOfQuarter) + middleLight(timeQuarter) + complementLights(numbersOfQuarter);
    }

    private int convertToQuarterTime(int minuteInt) {
        return minuteInt - (minuteInt / 15) * 15;
    }

    private String middleLight(int timeQuarter) {
        if (timeQuarter % 14 > 0) return "YYR";
        else if (timeQuarter % 9 > 0) return "YYO";
        else if (timeQuarter % 4 > 0) return "YOO";
        else return "OOO";
    }

    private String initialLights(int numbersOfQuater) {
        if(numbersOfQuater == 1) return "YYR";
        else if(numbersOfQuater == 2) return "YYRYYR";
        else return "YYRYYRYYR";
    }

    private String complementLights(int numbersOfQuarter) {
        if(numbersOfQuarter == 0) return "OOOOOOOO";
        else if(numbersOfQuarter == 1) return "OOOOO";
        else return "OO";
    }

    public String convertSingleMinutes(int[] timeInt) {
        int mod = timeInt[1] % 5;
        return convertIntToString(mod, 'M');
    }
}
