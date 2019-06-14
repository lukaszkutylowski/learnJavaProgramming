public class BerlinClock implements Clock {

    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = new int[3];
        int timeCharIndexInString = 0;

        for (int index = 0; index <= 2; index++) {
            timeInt[index] = Converter.convertCharsToInt(time, timeCharIndexInString);
            timeCharIndexInString += 3;
        }

        LukCharList list = new LukCharList();

        processingSeconds(timeInt[2],list);
        processingFiveHrs(timeInt[0],list);
        processingSingleHrs(timeInt[0], list);
        processingFiveMinutes(timeInt[1], list);
        processingSingleMinutes(timeInt[1], list);

        return list.toServletString();
    }

    private LukCharList processingSeconds(int secondsInt, LukCharList list) {
        return EngineBerlinClock.convertSeconds(secondsInt, list);
    }

    private LukCharList processingFiveHrs(int hoursInt, LukCharList list) {
        return EngineBerlinClock.convertFiveHrs(hoursInt, list);
    }

    private LukCharList processingSingleHrs(int hoursInt, LukCharList list) {
        return EngineBerlinClock.convertIntToHoursOrMinutesString(hoursInt, Flag.HOURS, list);
    }

    private LukCharList processingFiveMinutes(int minutesInt, LukCharList list) {
        return EngineBerlinClock.fiveMinutesLightBuilder(minutesInt, list);
    }

    private LukCharList processingSingleMinutes(int minutesInt, LukCharList list) {
        return EngineBerlinClock.convertIntToHoursOrMinutesString(minutesInt, Flag.MINUTES, list);
    }
}