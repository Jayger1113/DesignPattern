package behavioural.chainofresponsibility;

public class CEO extends Manager{

    public CEO(){
        super(CEO.class.getSimpleName());
    }

    @Override
    public void handleLeaveDay(int leaveDays) {
        if(leaveDays <= 14){
            approve(leaveDays);
        }else{
            if(getNext() != null){
                getNext().handleLeaveDay(leaveDays);
            }else{
                approveFail();
            }
        }
    }
}
