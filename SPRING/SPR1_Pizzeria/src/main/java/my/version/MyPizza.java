package my.version;

public class MyPizza implements InterfacePizza {
    private int price;
    private String name;

    public MyPizza(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
