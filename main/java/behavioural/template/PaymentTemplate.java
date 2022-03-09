package behavioural.template;

public abstract class PaymentTemplate {
    protected abstract void auth();
    protected abstract void calculateAccountBalance();
    protected abstract void finish();

    //定義template method, 此例以付款流程包含認證auth,帳戶餘額是否足夠,結束付款
    public final void pay(){
        auth();
        calculateAccountBalance();
        finish();
    }
}
