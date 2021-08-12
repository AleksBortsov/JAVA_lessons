package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        Employee boss = new Employee("Sunny Mobson", 90000);
        staff[0] = new Employee("Richard Mobson", 50000);
        staff[1] = new Employee("John Lenon", 50000);
        staff[2] = new Employee("Aleks Bortsov", 100000);
        boss.raiseSalary(20);
        staff[3] = boss;


        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name: " + e.getName() + ", salary: " + e.getSalary());
        }
    }
}
