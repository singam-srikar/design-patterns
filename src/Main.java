import Design_Patterns.proxy.protectionProxy.Database;
import Design_Patterns.proxy.protectionProxy.DatabaseProxy;
import Design_Patterns.proxy.virtualProxy.Movie;
import Design_Patterns.proxy.virtualProxy.Video;

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
//        Database db=new DatabaseProxy("ADMIN");
//        db.delete();

        //virtual proxy
        Video video =  new Movie("Paradise");
        Video video1 = new Movie("Salar");
        Video video2 = new Movie("KGF");
        Video video3 = new Movie("Premalu");
        video.play();
        video1.play();
        video2.play();
        video3.play();
    }
}