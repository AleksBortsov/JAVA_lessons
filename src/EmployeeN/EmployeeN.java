package EmployeeN;

import java.time.LocalDate;

public class EmployeeN {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private double bonus;

    EmployeeN(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
        this.bonus = bonus;
    }

    public EmployeeN(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = raise + salary;
    }

    public void getBonus() {
        this.bonus = bonus;
    }

//    public String toString(String name) {
//        return getName();
//    }

}
