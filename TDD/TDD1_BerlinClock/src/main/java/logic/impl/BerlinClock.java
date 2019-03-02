package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {
    public final String yellow = "Y";
    public final String red = "R";
    public final String off = "O";


    public BerlinClock() {
    }

    public String convertTime(String time) {
        int[] timeInt = Converter.convertCharsToInt(time);

        return convertSeconds(timeInt[2])
                + convertFiveHrs(timeInt[0])
                + convertSingleHrs(timeInt[0])
                + convertFiveMinutes(timeInt[1])
                + convertSingleMinutes(timeInt[1]);
    }

    public String convertSeconds(int timeInt) {
        return timeInt % 2 > 0 ? off : yellow;
    }

    public String convertFiveHrs(int decHours) {
          String initialValue = "OOOO"; //TODO
          StringBuilder newValue = new StringBuilder(initialValue);

          for (int i = decHours / 5; i > 0; i--) {
              newValue.setCharAt(i - 1, 'R');
          }

          return newValue.toString();
      }

    public String convertSingleHrs(int timeInt) {
        int modulo = timeInt % 5; //todo nazwa
            return convertIntToString(modulo, 'H');
    }

    public String convertIntToString(int modulo, char flag) {
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

    public String convertFiveMinutes(int timeInt) {
        int howMuchYellow = timeInt / 5;

        return fiveMinutesLightBulider(howMuchYellow);
    }

    private String fiveMinutesLightBulider(int howMuchYellow) {
        StringBuilder lightFiveMinutes = new StringBuilder();

        for (int i = 1; i <= howMuchYellow; i++) {
            if ((i % 3 == 0) && (i > 1)) {
                lightFiveMinutes.append(red);
            } else {
                lightFiveMinutes.append(yellow); //lightFiveMinutes.charAt(i) = red.charAt(0);
            }
        }
        while (lightFiveMinutes.length() < 11) {
            lightFiveMinutes.append(off);
        }

        return lightFiveMinutes.toString();
    }

    public String convertSingleMinutes(int timeInt) {
        int mod = timeInt % 5;
        return convertIntToString(mod, 'M');
    }
}
