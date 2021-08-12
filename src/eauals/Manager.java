package eauals;

public class Manager extends Employee {
    private double bonus;


    protected Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object thisObject) {
        if (!super.equals(thisObject)) return false;
        Manager other = (Manager) thisObject;
        return bonus == other.bonus;
    }

    public int hashCode() {
        return super.hashCode() + new Double(bonus).hashCode();
    }

    public String toString() {
        return super.toString() + "[bonus= " + bonus + " ]";
    }

    protected void testMethod() {

    }
}