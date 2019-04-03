package my.version;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public InterfacePizza pizzaMethod() {
        return new MyPizza(10,"Pyszna");
    }

    @Bean
    public InterfaceOrder orderMethod(InterfacePizza pizza) {
        return new MyOrder(pizza);
    }
}
