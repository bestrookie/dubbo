import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.impl.OrderServiceImpl;

import java.io.IOException;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/17 21:51
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用结束.....");
        System.in.read();
    }
}
