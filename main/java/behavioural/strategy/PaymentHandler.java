package behavioural.strategy;

public class PaymentHandler {

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay();
    }
}
