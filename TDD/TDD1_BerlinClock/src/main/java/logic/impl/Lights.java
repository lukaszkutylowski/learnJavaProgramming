package logic.impl;

public enum Lights {
    OFF("O"),
    YELLOW("Y"),
    RED("R"),
    INITIAL("OOOO");

    final private String light;

    Lights(String lightClock) {
        light = lightClock;
    }

    public String getLight() {
        return light;
    }
}
