package Design_Patterns.adaptor;

public class PaypalAdaptor implements PaymentService{
    PaypalGateway paypalGateway;

    public PaypalAdaptor(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay() {
            int result= paypalGateway.processPayment();
            if(result==1){
                return "SUCCESS";
            }
            return "FAILED";
        }

}
