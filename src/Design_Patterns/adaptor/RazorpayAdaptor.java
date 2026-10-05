package Design_Patterns.adaptor;

public class RazorpayAdaptor implements PaymentService{
    RazorpayGateway razorpayGateway;

    public RazorpayAdaptor(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public String pay() {

       boolean result = razorpayGateway.paymentPay();
        if(result){
            return "SUCCESS";
        }
        return "FAILED";
    }
}
