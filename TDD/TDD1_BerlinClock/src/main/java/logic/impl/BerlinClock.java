package logic.impl;

import logic.Clock;

public class BerlinClock implements Clock {

    /**
     * @param time in following format: HH:MM:SS shall be converted and returned as Berlin clock light bulb sequence
     *             00 -> O
     *             01 -> R
     * @return
     */
    public String convertTime(String time) {
        //programowanie sterowane testami TDD

        final int convertTime = Integer.parseInt(time);

        return convertTime % 2 > 0 ? "R" : "O";
    }
}
