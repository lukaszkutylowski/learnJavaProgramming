package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {
    public char yellow = 'Y';
    public char red = 'R';
    public char off = 'O';

    public String convertTime(String time) {
        int timeInt[];

        timeInt = convertCharsToInt(time);

        return convertSeconds(timeInt) + convertFiveHrs(timeInt) + convertSingleHrs(timeInt) + conversionFiveMinutes(timeInt) + convertSingleMinutes(timeInt);
    }

    private int[] convertCharsToInt(String time) {
        StringBuilder stringBuilder = new StringBuilder();
        int timeCharPosition = 0;
        int arrayInt[] = new int[3];

        for(int i = 0; i <= 2; i++) {
            stringBuilder.append(time.charAt(timeCharPosition));
            stringBuilder.append(time.charAt(timeCharPosition + 1));
            arrayInt[i] = Integer.parseInt(stringBuilder.toString());
            timeCharPosition += 3;
        }
        return arrayInt;
    }

    public char convertSeconds(int[] timeInt) {
        return timeInt[2] % 2 > 0 ? off : yellow;
    }

    public String convertFiveHrs(int[] timeInt) {
        String fiveHrsLight;
        int howMuch = 0;

        if(timeInt[0] < 5) { fiveHrsLight = fiveHrsLightBuilder(0); }
        else {
            int tempTime = 19;
            for(int i = 4; timeInt[0] % tempTime > 0; i--) {
                tempTime -= 5;
                howMuch = i;
            }
            fiveHrsLight = fiveHrsLightBuilder(howMuch);
        }
        return fiveHrsLight;
    }

    private String fiveHrsLightBuilder(int howMuchRed) {
        String light = "";

        for(int i = 0; i <= howMuchRed; i++) {
            light += red;
        }
        while(light.length() < 4) {
            light += off;
        }

        return light;
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
        int howMuchYellow = timeInt[1] / 5;

        return fiveMinutesLightBulider(howMuchYellow);
    }

    private String fiveMinutesLightBulider(int howMuchYellow) {
        String lightFiveMinutes = "";

        for(int i = 0; i < howMuchYellow; i++) {
            if(i % 3 == 0) lightFiveMinutes += red;
            else lightFiveMinutes += yellow;
        }
        while(lightFiveMinutes.length() < 11) lightFiveMinutes += off;

        return lightFiveMinutes;
    }

    public String convertSingleMinutes(int[] timeInt) {
        int mod = timeInt[1] % 5;
        return convertIntToString(mod, 'M');
    }
}
