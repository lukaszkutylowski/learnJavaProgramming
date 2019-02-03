public class PowerBank {

    int powerBankLevel = 10000;

    public void charge(Telefon telefon, int howMuch) {
        if(howMuch <= powerBankLevel) {
            telefon.chargeBattery(howMuch);

            this.powerBankLevel = powerBankLevel - howMuch;
        } else {
            System.out.println("can't charge");
        }
    }
}
