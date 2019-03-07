package logic.impl;

public class Converter {

    public static int[] convertCharsToInt(String time) {
        StringBuilder stringBuilder = new StringBuilder();
        int timeCharPosition = 0;
        int arrayInt[] = new int[3];

        for(int i = 0; i <= 2; i++) {
            stringBuilder.append(time.charAt(timeCharPosition));
            stringBuilder.append(time.charAt(timeCharPosition + 1));
            arrayInt[i] = Integer.parseInt(stringBuilder.toString());
            stringBuilder.setLength(0);
            timeCharPosition += 3;
        }
        return arrayInt;
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

    public static String fiveMinutesLightBulider(int howMuchYellow) {
        final String  yellow = "Y", red = "R", off = "O";
        StringBuilder lightFiveMinutes = new StringBuilder();

        for (int i = 1; i <= howMuchYellow; i++) {
            if ((i % 3 == 0) && (i > 1)) {
                lightFiveMinutes.append(red);
            } else {
                lightFiveMinutes.append(yellow);
            }
        }
        while (lightFiveMinutes.length() < 11) {
            lightFiveMinutes.append(off);
        }

        return lightFiveMinutes.toString();
    }
}
