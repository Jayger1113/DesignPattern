package behavioural.strategy;

public class ApplePay implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("you're using " + ApplePay.class.getSimpleName());
    }
}
