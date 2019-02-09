package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    /**
     * @param time in following format: HH:MM:SS shall be converted and returned as Berlin clock light bulb sequence
     *             Seconds:
     *             00 -> O
     *             01 -> Y
     *             02 -> O
     *             03 -> Y
     *             ...
     *             58 -> 0
     *             59 -> Y
     *
     * @return
     */
    public String convertSeconds(String time) {
        // TDD - Tested Driven Development - Programowanie Sterowane Testami

        final String secondsString = Character.toString(time.charAt(6)) + Character.toString(time.charAt(7));
        final int seconds = Integer.parseInt(secondsString);

        return seconds % 2 > 0 ? "Y" : "O";
    }

    public String convertFiveHrs(String time) {

        final String hoursString = Character.toString(time.charAt(0)) + Character.toString(time.charAt(1));
        final int hours = Integer.parseInt(hoursString);

        if ((hours >= 0) && (hours < 5)) return "OOOO";
        else if ((hours >= 5) && (hours < 10)) return "ROOO";
        else if ((hours >= 10) && (hours < 15)) return "RROO";
        else if ((hours >= 15) && (hours < 20)) return "RRRO";
        else if ((hours >= 20) && (hours < 24)) return "RRRR";
        else return "----";
    }
}
