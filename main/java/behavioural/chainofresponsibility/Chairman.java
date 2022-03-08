package behavioural.chainofresponsibility;

public class Chairman extends Manager {

    public Chairman() {
        super(Chairman.class.getSimpleName());
    }

    @Override
    public void handleLeaveDay(int leaveDays) {
        if (leaveDays <= 28) {
            approve(leaveDays);
        } else {
            if (getNext() != null) {
                getNext().handleLeaveDay(leaveDays);
            } else {
                approveFail();
            }
        }
    }
}
