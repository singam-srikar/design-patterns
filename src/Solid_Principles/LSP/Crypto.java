package Solid_Principles.LSP;

public class Crypto implements NonRefundPayment{
    @Override
    public void processPayment() {
        System.out.println("Crypto Processing");
    }
}
