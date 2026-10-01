package Design_Patterns.LSP;

import java.util.List;

public class PaymentClient {
    public void process(){
        List<Payment> paymentList = List.of(new UPI(), new CreditCard(), new Crypto());
        for(Payment payment: paymentList){
            payment.processPayment();
            payment.processRefund();
        }
    }
}
