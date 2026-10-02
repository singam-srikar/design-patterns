package Solid_Principles.LSP;

public interface Payment extends NonRefundPayment{
    void processRefund();
}
