package logic.impl;

public class Engine {

    public static String convertSeconds(int secondsInt) {
        int evenOrOdd = secondsInt % 2 > 0 ? 1 : 0;
        if(evenOrOdd == 0) {
            return "Y";
        } else {
            return "O";
        }
    }

    public static String convertFiveHrs(int hoursInt) {
        int howManyHrsLight = hoursInt / 5;
        String initialValue = "OOOO";
        StringBuilder newValue = new StringBuilder(initialValue);

        for (int i = howManyHrsLight; i > 0; i--) {
            newValue.setCharAt(i - 1, 'R');
        }

        return newValue.toString();
    }

    public static String convertIntToLights(int hoursInt, char flag) {
        int multipleFiveHrs = hoursInt % 5;
        StringBuilder light = new StringBuilder();

        for (int i = 1; i <= multipleFiveHrs; i++) {
            if (flag == 'H') {
                light.append("R");
            } else {
                light.append("Y");
            }
        }

        while (light.length() < 4)
            light.append("O");

        return light.toString();
    }

    public static String fiveMinutesLightBulider(int minutesInt) {
        int howMuchYellow = minutesInt / 5;
        int howMuchYYR = howMuchYellow / 3;
        final String yellow = "Y", red = "R", off = "O";
        StringBuilder lightFiveMinutes = new StringBuilder();

        for(int i = 1; i <= howMuchYYR; i++) {
            lightFiveMinutes.append(yellow + yellow + red);
        }

        for (int j = 1; j <= howMuchYellow - howMuchYYR * 3; j++) {
            lightFiveMinutes.append(yellow);
        }
        while (lightFiveMinutes.length() < 11) {
            lightFiveMinutes.append(off);
        }

        return lightFiveMinutes.toString();
    }
}
