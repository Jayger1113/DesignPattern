package behavioural.template;

public class ClientApp {

    public static void main(String[] args) {
        PaymentTemplate paymentTemplate;
        paymentTemplate = new ApplePay();
        paymentTemplate.pay();
        paymentTemplate = new GooglePay();
        paymentTemplate.pay();
    }
}
