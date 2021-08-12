package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        Person employee = new Employee("\nOleksandr", 60000, 2020, 01, 20);
        Person student = new Student("\nKatya", "junior trainee");
        //Employee employee1 = new Employee("Viktor", 60000, 2020, 03, 20);
        employee.raiseSalary(50);

        people[0] = employee;
        people[1] = student;
        System.out.print("\nEmployee hashCode: " + employee.hashCode() + "\nStudent  hashCode: " + student.hashCode());
        System.out.print("\nEmployee hashCode: " + employee.toString() + "\nStudent  hashCode: " + student.toString());

        employee = student;
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
        boolean tfE = employee.equals(people);
        boolean tfS = student.equals(people);
        boolean tfP = people.equals(people);
        boolean ftES = student.equals(employee);
        System.out.println("Employee equals people - " + tfE +
                "\nStudent equals people - " + tfS +
                "\nPeople equals people - " + tfP +
                "\nStudent equals Employee - " + ftES);
        System.out.print("\nEmployee hashCode: " + employee.hashCode() + "\nStudent  hashCode: " + student.hashCode());
        System.out.print("\nEmployee hashCode: " + employee.toString() + "\nStudent  hashCode: " + student.toString());
    }
}