import Design_Patterns.adaptor.*;
import Design_Patterns.builder.EmailService;
import Design_Patterns.builder.SmsService;
import Design_Patterns.factoryMethod.DeliveryService;
import Design_Patterns.factoryMethod.OrderService;
import Design_Patterns.prototype.UserService;
import Design_Patterns.proxy.PaymenService;
import Design_Patterns.proxy.PaymentProxy;
import Design_Patterns.proxy.PaymentServiceImpl;
import Design_Patterns.proxy.protectionProxy.Database;
import Design_Patterns.proxy.protectionProxy.DatabaseProxy;
import Design_Patterns.proxy.protectionProxy.MySqlDb;
import Design_Patterns.singleton.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //lsp
//        PaymentClient paymentClient = new PaymentClient();
//        paymentClient.process();

        //factory call
//        OrderService orderService = new OrderService();
//        orderService.process("Email");
//        orderService.processMultipleNotifications(List.of("Email","SMS"));

//        DeliveryService deliveryService = new DeliveryService();
//        deliveryService.process("SMS");


        //factory method call
//        OrderService orderService = new OrderService();
//        orderService.process();
//
//        DeliveryService deliveryService = new DeliveryService();
//        deliveryService.process();

        //builder
//        EmailService emailService = new EmailService();
//        emailService.sendEmail();
//        SmsService smsService = new SmsService();
//        smsService.sendSms();

        //singleton
//        Calculator calculator = Calculator.getInstance();
//        Calculator calculator1 = Calculator.getInstance();


//        calculator1.a=4;
//        calculator1.b=5;
//
//        System.out.println(calculator.sum());
//        System.out.println(calculator1.sum());
//
//        singleton-thread safety
//        Thread t1  = new Thread(Calculator::getInstance);
//        Thread t2  = new Thread(()->{
//            Calculator.getInstance();
//        });
//        t1.start();
//        t2.start();

        //prototype
//        UserService userService = new UserService();
//        userService.show();

        //adaptor
//        PaymentClient paymentClient = new PaymentClient(new PaypalAdaptor(new PaypalGateway()));
//      PaymentClient paymentClient = new PaymentClient(new RazorpayAdaptor(new RazorpayGateway()));
//        paymentClient.payNow();

        //proxy

//        PaymenService payment = new PaymentServiceImpl();
//        PaymentProxy paymentProxy = new PaymentProxy(payment);
//        paymentProxy.pay(1000);
        //protected proxy
        Database db=new DatabaseProxy("ADMIN");
        db.delete();
    }
}