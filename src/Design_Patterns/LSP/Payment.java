package Design_Patterns.LSP;

public interface Payment extends NonRefundPayment{
    void processRefund();
}
