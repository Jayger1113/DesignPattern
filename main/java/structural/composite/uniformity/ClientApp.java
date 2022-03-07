package structural.composite.uniformity;

public class ClientApp {
    public static void main(String[] args) {
        Organization headQuarter = new ParentDepartment("headQuarter");
        Organization twObu = new ParentDepartment("taiwan office");

        Organization rdOrg = new Department("research & development department", 5);
        twObu.add(rdOrg);
        Organization salesOrg = new Department("sales department", 10);
        twObu.add(salesOrg);

        headQuarter.add(twObu);

        headQuarter.print();
    }
}