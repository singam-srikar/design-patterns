package Design_Patterns.proxy;

public class PaymentServiceImpl implements PaymenService{
    @Override
    public void pay() {
        //so here we are injecting auth logic inside pay method which breaks SRP and OCP
        System.out.println("checking autherization");
        boolean authUser=false;

        if(authUser) System.out.println("Payment done");
        else System.out.println("Payment failed");
    }
}
