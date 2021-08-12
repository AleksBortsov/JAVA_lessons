package Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeTest {
    public static void main(String[] args) {

        //заполнить массив staff тремя объектами типа Employee

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl", 75000, 1987, 12, 12);
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 40000, 1990, 3, 15);

        //increment salary in 5%
        for (Employee e : staff) {
            e.raiseSalary(5.0);
        }
        for (Employee e : staff)
            System.out.println("name: " + e.getName() + ". Salary: " + e.getSalary() + ". HireDay: " + e.getHireDay());

        System.out.println("Lambda sort by hireDay: ");
        Arrays.sort(staff, Comparator.comparing(Employee::getHireDay));
        for (Employee e : staff)
            System.out.println("name: " + e.getName() +
                    ". Salary: " + e.getSalary() +
                    ". HireDay: " + e.getHireDay());

        Arrays.sort(staff, Comparator.comparing(Employee::getSalary,
                (s, t) -> Integer.compare(s.intValue(), t.intValue())));
        System.out.println("Lambda sort by salary: ");
        for (Employee e : staff)
            System.out.println("name: " + e.getName() + ". Salary: " + e.getSalary() + ". HireDay: " + e.getHireDay());
    }
}

class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;
    public double bonus;

    public void setBonus(double b) {
        this.bonus = b;
    }


    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId++;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
