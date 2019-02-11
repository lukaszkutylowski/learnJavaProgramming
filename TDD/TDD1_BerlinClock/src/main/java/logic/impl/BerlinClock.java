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

    public String convertSingleHrs(String time) {

        final String hoursString = Character.toString(time.charAt(0)) + Character.toString(time.charAt(1));
        final int hours = Integer.parseInt(hoursString);

        if (hours % 5 == 0) return "OOOO";
        if (hours % 5 == 1) return "ROOO";
        if (hours % 5 == 2) return "RROO";
        if (hours % 5 == 3) return "RRRO";
        if (hours % 5 == 4) return "RRRR";
        else return "----";
    }

    public String conversionFiveMinutes(String time) {

        final String minutesString = Character.toString(time.charAt(3)) + Character.toString(time.charAt(4));
        final int minutes = Integer.parseInt(minutesString);

        if (minutes < 5) return "OOOOOOOOOOO";
        else if ((minutes >= 5) && (minutes < 10)) return "YOOOOOOOOOO";
        else if ((minutes >= 10) && (minutes < 15)) return "YYOOOOOOOOO";
        else if ((minutes >= 15) && (minutes < 20)) return "YYROOOOOOOO";
        else if ((minutes >= 20) && (minutes < 25)) return "YYRYOOOOOOO";
        else if ((minutes >= 25) && (minutes < 30)) return "YYRYYOOOOOO";
        else if ((minutes >= 30) && (minutes < 35)) return "YYRYYROOOOO";
        else if ((minutes >= 35) && (minutes < 40)) return "YYRYYRYOOOO";
        else if ((minutes >= 40) && (minutes < 45)) return "YYRYYRYYOOO";
        else if ((minutes >= 45) && (minutes < 50)) return "YYRYYRYYROO";
        else if ((minutes >= 50) && (minutes < 55)) return "YYRYYRYYRYO";
        else return "YYRYYRYYRYY";
    }
}
