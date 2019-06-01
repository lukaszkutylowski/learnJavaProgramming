package my.version;

public class AnotherPizza implements InterfacePizza {

    private int price;
    private String name;

    public AnotherPizza(int price, String name) {
        super();
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
