package Solid_Principles.LSP;

import java.util.List;
//A subclass should implement all methods logically so that we can use subclass in place
//of parent class as well

//if it is not possible we have to separate the interfaces and subclass
// can choose which one to implement
public class PaymentClient {
    public void process(){
        List<Payment> paymentList = List.of(new UPI(), new CreditCard());
        //we can call both pay and refund here
        for(Payment payment: paymentList){
            payment.processPayment();
            payment.processRefund();
        }

        //Only can call pay due to different interface we are calling and it has only pay method
        NonRefundPayment nonRefundPayment = new Crypto();
        nonRefundPayment.processPayment();
    }
}
