package Design_Patterns.LSP;

public class CreditCard implements Payment{
    @Override
    public void processPayment() {
        System.out.println("CC process");
    }

    @Override
    public void processRefund() {
        System.out.println("CC refund");
    }
}
