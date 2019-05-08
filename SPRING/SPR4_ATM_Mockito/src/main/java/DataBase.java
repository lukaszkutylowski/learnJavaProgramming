public class DataBase {
    private int money = 1000;

    public int saveChangeAndGetMoney(int howMuch) {
        money -= howMuch;
        int extraCash = 10;
        return howMuch + extraCash;
    }
}
