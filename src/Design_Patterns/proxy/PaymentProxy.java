package Design_Patterns.proxy;

public class PaymentProxy implements PaymenService{
    private PaymenService paymenService;
    private String role;

    public PaymentProxy(PaymenService paymenService) {
        this.paymenService = paymenService;
    }

    @Override
    public void pay(int amount) {
        //so we are creating proxy class and handling additional logic here without modifying PaymentImpl class
        System.out.println("checking autherization");
        boolean authUser=true;
        if(authUser){
            paymenService.pay(amount);
        }
        else System.out.println("User not authorized");
    }

    ///Client
    //  |
    //  | pay(5000)
    //  ↓
    //PaymentServiceProxy
    //  |
    //  | authorization
    //  | logging
    //  | validation
    //  ↓
    //PaymentServiceImpl
    //  |
    //  ↓
    //Actual payment
}
