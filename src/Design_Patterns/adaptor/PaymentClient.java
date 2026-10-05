package Design_Patterns.adaptor;

import java.util.Objects;

public class PaymentClient {
    PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payNow(){
        String result = paymentService.pay();
        if(Objects.equals(result, "SUCCESS")){
            System.out.println("Payment success");
        }
        else System.out.println("Payment failed");
    }
}
