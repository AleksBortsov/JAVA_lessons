package AbstractClasses;

public class Student extends Person {
    private String major;

    protected Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    protected String getDescription() {
        return "-a student majority in- " + major;
    }
    @Override
    protected void raiseSalary(double byPercent) {
    }
}
