public class ATM {

    private CreditCard card;
    private DataBase base;
    private int cashForClient;

    ATM(CreditCard card, DataBase base) {
        this.card = card;
        this.base = base;
    }

    public int getMoney(CreditCard card, int howMuch) {
        System.out.println(card.getID());
        System.out.println(card.getPassword());
        if ( (card.getID() == 334455) && (card.getPassword() == 1234) ) {
            this.cashForClient = base.saveChangeAndGetMoney(howMuch);
        }
        return this.cashForClient;
    }
}
