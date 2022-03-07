package structural.composite.safety;

public class ClientApp {

    public static void main(String[] args) {
        ParentDepartment headQuarter = new ParentDepartment("headQuarter");
        ParentDepartment twObu = new ParentDepartment("taiwan office");

        Department rdDepartment = new Department("research & development department", 5);
        twObu.add(rdDepartment);
        Department salesDepartment = new Department("sales department", 10);
        twObu.add(salesDepartment);

        headQuarter.add(twObu);
        headQuarter.print();
    }
}