package behavioural.chainofresponsibility;

public class DepartmentManager extends Manager{

    public DepartmentManager(){
        super(DepartmentManager.class.getSimpleName());
    }

    @Override
    public void handleLeaveDay(int leaveDays) {
        if(leaveDays <= 7) {
            this.approve(leaveDays);
        } else {
            if (getNext() != null) {
                getNext().handleLeaveDay(leaveDays);
            }
            else {
                approveFail();
            }
        }
    }
}
