package behavioural.chainofresponsibility;


//Suppose we have following hierarchy
// Chairman > CEO >  DepartmentManager
public abstract class Manager {

    private Manager next;
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void setNext(Manager next) {
        this.next = next;
    }

    public Manager getNext() {
        return next;
    }

    public void approve(int leaveDays) {
        System.out.println(name + " approve your " + leaveDays + " days leave");
    }

    public void approveFail() {
        System.out.println("There are too many days of leave");
    }

    // 處理請求的方法
    public abstract void handleLeaveDay(int LeaveDays);
}