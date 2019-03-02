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
}
