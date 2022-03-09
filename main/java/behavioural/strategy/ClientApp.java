package behavioural.strategy;

public class ClientApp {
    public static void main(String[] args) {
        PaymentHandler paymentHandler = new PaymentHandler();
        paymentHandler.pay(new GooglePay());
        paymentHandler.pay(new ApplePay());
    }
}
