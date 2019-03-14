package logic.impl;

public class Converter {

    public static int convertCharsToInt(String time, int timeCharPosition) {
        int timeInt;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(time.charAt(timeCharPosition));
        stringBuilder.append(time.charAt(timeCharPosition + 1));
        timeInt = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);

        return timeInt;
    }
}
