package logic.impl;

public enum Enum {
    HOURS(""),
    MINUTES(""),
    OFF("O"),
    YELLOW("Y"),
    RED("R");

    final private String light;

    Enum(String lightClock) {
        light = lightClock;
    }

    public String getLight() {
        return light;
    }
}
