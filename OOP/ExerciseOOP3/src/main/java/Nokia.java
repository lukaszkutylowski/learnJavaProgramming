public class Nokia implements Telefon {

    private String name = "Nokia";
    private int actualStateOfBattery = 2456;
    private final int BATTERY = 4000;

    public void chargeBattery(int howMuch) {
        actualStateOfBattery = actualStateOfBattery + howMuch;
    }

    public int returnPowerLevel() {
        return actualStateOfBattery;
    }

    public String returnName() {
        return this.name;
    }
}
