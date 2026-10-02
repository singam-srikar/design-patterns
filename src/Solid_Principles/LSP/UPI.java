package Solid_Principles.LSP;

public class UPI implements Payment, NonRefundPayment{
    @Override
    public void processPayment() {
        System.out.println("UPI processing");
    }

    @Override
    public void processRefund() {
        System.out.println("UPI refund");
    }
}
