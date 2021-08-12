package AbstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    protected Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    protected double getSalary() {
        return salary;
    }

    protected LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    protected String getDescription() {
        return String.format("-an emloyee with salary of $%.2f US dollars-", salary);
    }

    protected void raiseSalary(double byPercent) {
        double raise = salary + byPercent / 100;
        salary += raise;
    }
}
