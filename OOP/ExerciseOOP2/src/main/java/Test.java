public class Test {

    public static void main(String[] args) {

        Chargeable nokia = new Nokia();
        PowerBank powerBank = new PowerBank();
        Source230V source230V = new Source230V();

        System.out.println("Nokia battery level: " + nokia.getPowerLevel());
        System.out.println("Power bank battery level: " + powerBank.getPowerLevel());

        powerBank.chargePhone(nokia);

        System.out.println("Nokia battery level after charging: " + nokia.getPowerLevel());
        System.out.println("Power bank battery level after Nokia charging: " + powerBank.getPowerLevel());

        source230V.chargePowerBank(powerBank);

        System.out.println("Power bank battery level after charging from 230V: " + powerBank.getPowerLevel());
    }
}
