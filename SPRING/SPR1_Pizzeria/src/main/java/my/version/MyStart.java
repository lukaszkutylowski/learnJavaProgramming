package my.version;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyStart {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        InterfaceOrder order = (InterfaceOrder) context.getBean("orderMethod");

        order.printOrder();
    }
}
