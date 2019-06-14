public class Car {

    private int wheelRollCount;

    private Wheel wheel1;
    private Wheel wheel2;

    Car(Wheel wheel1, Wheel wheel2) {
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheelRollCount = 0;
    }

    public void drive(int distance) {
        int rev = distance * 2;
        wheelRollCount = wheel1.roll(rev);
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public int getWheelRollCount() {
        return wheelRollCount;
    }
}
