package Design_Patterns.LSP;

public class Crypto implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Crypto Processing");
    }

    @Override
    public void processRefund() {
        throw new UnsupportedOperationException("Refund not applicable");
    }
}
