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
        final String fiveMinutes = conversionFiveMinutes(time);
        final String singleMinutes = convertSingleMinutes(time);

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
        else return convertIntToString(modulo);
    }

    private String convertIntToString(int modulo){
        String light = "";

        for(int i = 1; i <= modulo; i++)
            light += "R";

        while(light.length() < 4)
            light += "O";

        return light;
    }

    public String conversionFiveMinutes(String time) {

        final String minutesString = Character.toString(time.charAt(3)) + Character.toString(time.charAt(4));
        final int minutes = Integer.parseInt(minutesString);

        if (minutes < 5) return "OOOOOOOOOOO";
        else if ((minutes >= 5) && (minutes < 10)) return "YOOOOOOOOOO";
        else if ((minutes >= 10) && (minutes < 15)) return "YYOOOOOOOOO";
        else if ((minutes >= 15) && (minutes < 20)) return "YYROOOOOOOO";
        else if ((minutes >= 20) && (minutes < 25)) return "YYRYOOOOOOO";
        else if ((minutes >= 25) && (minutes < 30)) return "YYRYYOOOOOO";
        else if ((minutes >= 30) && (minutes < 35)) return "YYRYYROOOOO";
        else if ((minutes >= 35) && (minutes < 40)) return "YYRYYRYOOOO";
        else if ((minutes >= 40) && (minutes < 45)) return "YYRYYRYYOOO";
        else if ((minutes >= 45) && (minutes < 50)) return "YYRYYRYYROO";
        else if ((minutes >= 50) && (minutes < 55)) return "YYRYYRYYRYO";
        else return "YYRYYRYYRYY";
    }

    public String convertSingleMinutes(String time) {

        final String minutesString = Character.toString(time.charAt(4));
        final int minutes = Integer.parseInt(minutesString);

        if (minutes % 5 == 1) return "YOOO";
        else if (minutes % 5 == 2) return "YYOO";
        else if (minutes % 5 == 3) return "YYYO";
        else if (minutes % 5 == 4) return "YYYY";
        else return "OOOO";
    }
}
