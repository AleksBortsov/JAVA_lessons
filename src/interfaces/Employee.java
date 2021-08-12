package interfaces;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }

    protected void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += salary;
    }

    public int compareTo(Employee other) {
        if (getClass() != other.getClass()) throw new ClassCastException();
        return Double.compare(salary, other.salary);
    }
}
