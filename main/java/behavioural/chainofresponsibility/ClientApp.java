package behavioural.chainofresponsibility;

public class ClientApp {
    public static void main(String[] args){
        DepartmentManager departmentManager = new DepartmentManager();
        CEO ceo = new CEO();
        Chairman chairman = new Chairman();
        departmentManager.setNext(ceo);
        ceo.setNext(chairman);

        int leaveDays = 20;
        departmentManager.handleLeaveDay(leaveDays);
    }
}
