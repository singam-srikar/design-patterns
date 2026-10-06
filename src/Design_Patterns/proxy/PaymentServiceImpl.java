package Design_Patterns.proxy;

public class PaymentServiceImpl implements PaymenService{
    @Override
    public void pay(int amount) {
        //payment logic
        System.out.println("Payment done "+amount);

    }
}
