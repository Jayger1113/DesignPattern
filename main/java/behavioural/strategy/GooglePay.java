package behavioural.strategy;

public class GooglePay implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("you're using " + GooglePay.class.getSimpleName());
    }
}
