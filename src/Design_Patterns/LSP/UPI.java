package Design_Patterns.LSP;

public class UPI implements Payment{
    @Override
    public void processPayment() {
        System.out.println("UPI processing");
    }

    @Override
    public void processRefund() {
        System.out.println("UPI refund");
    }
}
