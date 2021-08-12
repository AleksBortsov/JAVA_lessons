package eauals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams ", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams ", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Drandson ", 50000, 1989, 10, 1);

        System.out.println("alice1==alice2: " + (alice1 == alice2));
        System.out.println("alice1==alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice2): " + alice1.equals(alice2));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): " + bob);

        Manager carlCracker = new Manager("Carl Cracker ", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker ", 80000, 1987, 12, 15);
        boss.setBonus(3000);

        double salaryWithBonus = boss.getSalary();
        System.out.println("Salary boss with bonus: " + salaryWithBonus);

        boss.raiseSalary(10);
        double salaryWithBonusandRaise = boss.getSalary();
        System.out.println("Salary boss with bonus and raise: " + salaryWithBonusandRaise);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carlCracker.equals(boss): " + carlCracker.equals(boss));
        System.out.println("alice1.hashCode: " + alice1.hashCode());
        System.out.println("alice3.hashCode: " + alice3.hashCode());
        System.out.println("bob.hashCode: " + bob.hashCode());
        System.out.println("carlCracker.hashCode: " + carlCracker.hashCode());

        System.out.println(boss.getClass().getName() + " " + boss.getName());
    }
}
