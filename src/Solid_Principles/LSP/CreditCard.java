package Solid_Principles.LSP;

public class CreditCard implements Payment, NonRefundPayment{
    @Override
    public void processPayment() {
        System.out.println("CC process");
    }

    @Override
    public void processRefund() {
        System.out.println("CC refund");
    }
}
