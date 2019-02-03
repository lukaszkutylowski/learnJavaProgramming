public class Test {

    public static void main(String[] args) {

        Telefon nokia = new Nokia();
        Telefon samsung = new Samsung();
        PowerBank powerBank = new PowerBank();

        int value = 500;

        System.out.println(nokia.returnPowerLevel());

        powerBank.charge(nokia,value);

        System.out.println(nokia.returnPowerLevel());
    }
}
