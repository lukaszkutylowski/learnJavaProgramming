package logic.impl;

public class EngineBerlinClock {

    public static String convertSeconds(int secondsInt) {
        if (secondsInt % 2 == 0) {
            return Lights.YELLOW.getLight();
        } else {
            return Lights.OFF.getLight();
        }
    }

    public static String convertFiveHrs(int hoursInt) {
        int howManyHrsLight = hoursInt / 5;
        String initialValue = Lights.INITIAL.getLight();
        StringBuilder newValue = new StringBuilder(initialValue);

        for (int i = howManyHrsLight; i > 0; i--) {
            newValue.setCharAt(i - 1, Lights.RED.getLight().charAt(0));
        }
        return newValue.toString();
    }

    public static String convertIntToHoursOrMinutesString(int hoursInt, Flag FLAG) {
        int multipleFiveHrs = hoursInt % 5;
        StringBuilder light = new StringBuilder();

        for (int i = 1; i <= multipleFiveHrs; i++) {
            if (FLAG == FLAG.HOURS) {
                light.append(Lights.RED.getLight());
            } else {
                light.append(Lights.YELLOW.getLight());
            }
        }

        while (light.length() < 4)
            light.append(Lights.OFF.getLight());

        return light.toString();
    }

    public static String fiveMinutesLightBuilder(int minutesInt) {
        int howMuchYellow = minutesInt / 5;
        int howMuchYYR = howMuchYellow / 3;
        StringBuilder lightFiveMinutes = new StringBuilder();

        for(int i = 1; i <= howMuchYYR; i++) {
            lightFiveMinutes.append(Lights.YELLOW.getLight() + Lights.YELLOW.getLight() + Lights.RED.getLight());
        }

        for (int j = 1; j <= howMuchYellow - howMuchYYR * 3; j++) {
            lightFiveMinutes.append(Lights.YELLOW.getLight());
        }
        while (lightFiveMinutes.length() < 11) {
            lightFiveMinutes.append(Lights.OFF.getLight());
        }

        return lightFiveMinutes.toString();
    }
}
