package eauals;

import java.util.ArrayList;

public class ArrayListE {
    public static void main(String[] args) {
        ArrayList<Employee> staffArrayList = new ArrayList<Employee>();

        staffArrayList.add(new Employee("Katya", 50000, 1988, 12, 15));
        staffArrayList.add(new Employee("Ruslan", 45000, 1988, 12, 13));
        staffArrayList.add(new Employee("Aleksandr", 80000, 2020, 01, 18));
        for (Employee employee : staffArrayList) {
            System.out.println("name: " + employee.getName() + ", salary "
                    + employee.getSalary() + ", hire Day "
                    + employee.getHireDay());
        }
    }
}
