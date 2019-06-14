public class Source230V {

    public Source230V() {
    }

    public void chargePowerBank(PowerBank powerBank) {
        powerBank.charge(powerBank.getPowerNeed());
    }
}
