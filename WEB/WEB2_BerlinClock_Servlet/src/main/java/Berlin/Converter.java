package Berlin;

public class Converter {

    public static int convertCharsToInt(String time, int timeCharIndexInString) {
        int timeInt;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(time.substring(timeCharIndexInString, timeCharIndexInString + 2));
        timeInt = Integer.parseInt(stringBuilder.toString());

        return timeInt;
    }
}
