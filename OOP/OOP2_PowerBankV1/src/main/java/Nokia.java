public class Nokia implements Chargeable {
    private final int TOTAL_CAPACITY = 3500;
    private int currentCapacity = 0;

    public Nokia() {
    }

    public int getPowerNeed() {
        return 3500 - this.currentCapacity;
    }

    public void charge(int getMah) {
        if (getMah + this.currentCapacity <= 3500) {
            this.currentCapacity += getMah;
        } else {
            getMah = 3500 - this.currentCapacity;
        }
    }

    public int getPowerLevel() {
        return this.currentCapacity;
    }
}
