package AbstractClasses;

public abstract class Person {

    protected abstract String getDescription();

    private String name;

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected abstract void raiseSalary(double byPercent);
}
