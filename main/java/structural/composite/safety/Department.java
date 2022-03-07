package structural.composite.safety;

public class Department implements Organization {
    private String name;
    private int employeeNumber;

    public Department(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public void print() {
        toString();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}