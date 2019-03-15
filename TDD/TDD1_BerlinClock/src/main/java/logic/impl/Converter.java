package logic.impl;

public class Converter {

    public static int convertCharsToInt(String time, int timeCharIndexInString) {
        int timeInt;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(time.charAt(timeCharIndexInString));
        stringBuilder.append(time.charAt(timeCharIndexInString + 1));
        timeInt = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);

        return timeInt;
    }
}
