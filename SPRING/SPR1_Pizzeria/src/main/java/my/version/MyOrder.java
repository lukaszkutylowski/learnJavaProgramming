package my.version;

public class MyOrder implements InterfaceOrder {
    InterfacePizza pizza;

    public MyOrder(InterfacePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("ORDER: name - " + pizza.getName() + ", price - " + pizza.getPrice());
    }
}
