package my.version;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public InterfacePizza pizzaMethod() {
        return new AnotherPizza(15,"Another Pizza");
    }

    @Bean
    public InterfaceOrder orderMethod(InterfacePizza pizza) {
        return new MyOrder(pizza);
    }
}
