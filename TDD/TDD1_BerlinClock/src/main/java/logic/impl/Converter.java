package logic.impl;

public class Converter {

    public static int convertCharsToInt(String time, int timeCharPosition) {
        int timeInt = 0;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(time.charAt(timeCharPosition));
        stringBuilder.append(time.charAt(timeCharPosition + 1));
        timeInt = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);

        return timeInt;
    }

    public static String convertSeconds(int evenOrOdd) {
        if(evenOrOdd == 0) {
            return "Y";
        } else {
            return "O";
        }
    }

    public static String convertFiveHrs(int hoursInt) {
        String initialValue = "OOOO";
        StringBuilder newValue = new StringBuilder(initialValue);

        for (int i = hoursInt; i > 0; i--) {
            newValue.setCharAt(i - 1, 'R');
        }

        return newValue.toString();
    }

    public static String convertIntToString(int modulo, char flag) {
        StringBuilder light = new StringBuilder();

        for (int i = 1; i <= modulo; i++) {
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

    public static String fiveMinutesLightBulider(int howMuchYellow, int howMuchYYR) {
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
