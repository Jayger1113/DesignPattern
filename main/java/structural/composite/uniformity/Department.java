package structural.composite.uniformity;

public class Department implements Organization {
    private String name;
    private int employeeNumber;

    public Department(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public void add(Organization organization) {
    }

    public void remove(Organization organization) {
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}