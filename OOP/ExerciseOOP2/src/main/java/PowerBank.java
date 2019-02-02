public class PowerBank implements Chargeable {
    private int TOTAL_CAPACITY = 5000;
    private int currentCapacity = 5000;

    public PowerBank() {
    }

    public int chargePhone(Chargeable chargeable) {
        int getMah = chargeable.getPowerNeed();
        if (getMah <= this.currentCapacity) {
            this.currentCapacity -= getMah;
        } else {
            getMah = this.currentCapacity;
            this.currentCapacity = 0;
        }

        chargeable.charge(getMah);
        return getMah;
    }

    public int getPowerNeed() {
        int giveMahToPB = this.getTOTAL_CAPACITY() - this.getPowerLevel();
        return giveMahToPB;
    }

    public void charge(int giveMahToPB) {
        this.currentCapacity += giveMahToPB;
    }

    public int getTOTAL_CAPACITY() {
        return this.TOTAL_CAPACITY;
    }

    public int getPowerLevel() {
        return this.currentCapacity;
    }
}
