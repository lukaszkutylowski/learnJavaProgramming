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

        final int seconds = time.charAt(4) + time.charAt(5);

        return seconds % 2 > 0 ? "Y" : "O";
    }

    public String convertFiveHrs(String time) {
        return "OOOO";
    }
}
