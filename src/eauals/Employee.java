package eauals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    protected Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    protected String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }

    protected LocalDate getHireDay() {
        return hireDay;
    }

    protected void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name= " + name + ", salary= " + salary + ", hireDay= " + hireDay + "]";
    }
}