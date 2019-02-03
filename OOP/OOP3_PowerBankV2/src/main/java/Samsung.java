public class Samsung implements Telefon {

    private String name = "Samsung";
    private int actualStateOfBattery = 3454;
    private final int BATTERY = 5000;

    public void chargeBattery(int howMuch) {
        actualStateOfBattery = actualStateOfBattery + howMuch;
    }

    public int returnPowerLevel() {
        return this.actualStateOfBattery;
    }

    public String returnName() {
        return this.name;
    }
}
