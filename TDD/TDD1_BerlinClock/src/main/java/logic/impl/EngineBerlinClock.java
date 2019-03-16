package logic.impl;

public class EngineBerlinClock {

    public static String convertSeconds(int secondsInt) {
        if (secondsInt % 2 == 0) {
            return Enum.YELLOW.getLight();
        } else {
            return Enum.OFF.getLight();
        }
    }

    public static String convertFiveHrs(int howManyHrsLight) {
        String initialValue = "OOOO";
        StringBuilder newValue = new StringBuilder(initialValue);

        for (int i = howManyHrsLight; i > 0; i--) {
            newValue.setCharAt(i - 1, 'R');
        }
        return newValue.toString();
    }

    public static String convertIntToLights(int hoursInt, Enum FLAG) {
        int multipleFiveHrs = hoursInt % 5;
        StringBuilder light = new StringBuilder();

        for (int i = 1; i <= multipleFiveHrs; i++) {
            if (FLAG == Enum.HOURS) {
                light.append(Enum.RED.getLight());
            } else {
                light.append(Enum.YELLOW.getLight());
            }
        }

        while (light.length() < 4)
            light.append(Enum.OFF.getLight());

        return light.toString();
    }

    public static String fiveMinutesLightBuilder(int minutesInt) {
        int howMuchYellow = minutesInt / 5;
        int howMuchYYR = howMuchYellow / 3;
        StringBuilder lightFiveMinutes = new StringBuilder();

        for(int i = 1; i <= howMuchYYR; i++) {
            lightFiveMinutes.append(Enum.YELLOW.getLight() + Enum.YELLOW.getLight() + Enum.RED.getLight());
        }

        for (int j = 1; j <= howMuchYellow - howMuchYYR * 3; j++) {
            lightFiveMinutes.append(Enum.YELLOW.getLight());
        }
        while (lightFiveMinutes.length() < 11) {
            lightFiveMinutes.append(Enum.OFF.getLight());
        }

        return lightFiveMinutes.toString();
    }
}
