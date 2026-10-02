import Design_Patterns.factory.DeliveryService;
import Design_Patterns.factory.OrderService;
import Solid_Principles.LSP.PaymentClient;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //lsp
//        PaymentClient paymentClient = new PaymentClient();
//        paymentClient.process();

        //factory call
        OrderService orderService = new OrderService();
        orderService.process("Email");
        orderService.processMultipleNotifications(List.of("Email","SMS"));

        DeliveryService deliveryService = new DeliveryService();
//        deliveryService.process("SMS");
    }
}