public enum Lights {
    OFF('O'),
    YELLOW('Y'),
    RED('R');

    final private char light;

    Lights(char lightClock) {
        light = lightClock;
    }

    public char getLight() {
        return light;
    }
}
