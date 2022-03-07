package structural.composite.uniformity;

import java.util.ArrayList;

public class ParentDepartment implements Organization {
    private String name;
    private ArrayList<Organization> organizationList = new ArrayList<Organization>();

    public ParentDepartment(String name) {
        this.name = name;
    }

    public void add(Organization organization) {
        organizationList.add(organization);
    }

    public void remove(Organization organization) {
        organizationList.remove(organization);
    }

    public void print() {
        System.out.println("parentDepartment: " + name);
        for (Object organization: organizationList) {
            ((Organization) organization).print();
        }
    }

}