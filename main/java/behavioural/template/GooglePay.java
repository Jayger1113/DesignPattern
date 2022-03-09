package behavioural.template;

public class GooglePay extends PaymentTemplate{
    @Override
    protected void auth() {
        System.out.println(GooglePay.class.getSimpleName() + " auth complete");
    }

    @Override
    protected void calculateAccountBalance() {
        System.out.println(GooglePay.class.getSimpleName() + " calculateAccountBalance complete");
    }

    @Override
    protected void finish() {
        System.out.println(GooglePay.class.getSimpleName() + " finish");
    }
}
