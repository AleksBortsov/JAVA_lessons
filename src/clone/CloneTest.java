package clone;

import java.util.Arrays;
import java.util.Comparator;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee originalEmployee = new Employee("Aleks B", 120000);
        originalEmployee.setHireDay(2020, 02, 02);
        Employee copyEmployee = originalEmployee.clone();
        copyEmployee.raseSalary(30);
        copyEmployee.setHireDay(2020, 01, 20);

        System.out.println("original Employee " + originalEmployee);
        System.out.println("copy Employee " + copyEmployee);

        boolean eq = originalEmployee.equals(copyEmployee);
        System.out.println("original EQ copy=" + eq);
        System.out.println("original Employee:" + originalEmployee.hashCode());
        System.out.println("copy Employee: " + copyEmployee.hashCode());

    }
}
