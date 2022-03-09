package behavioural.template;

public class ApplePay extends PaymentTemplate {
    @Override
    protected void auth() {

        System.out.println(ApplePay.class.getSimpleName() + " auth complete");
    }

    @Override
    protected void calculateAccountBalance() {
        System.out.println(ApplePay.class.getSimpleName() + " calculateAccountBalance complete");
    }

    @Override
    protected void finish() {

        System.out.println(ApplePay.class.getSimpleName() + " finish");
    }
}
