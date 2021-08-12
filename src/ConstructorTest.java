import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee [] staff=new Employee[3];
    }
}
class Employee {
    private static int nextId;
    private int id;
    private String name="";
    private double salary;
    //static block inicialization
    static {
        Random generator=new Random();
        nextId =generator.nextInt(1000);
    }
    //block inic object
    {
        id=nextId;
        nextId++;
    }
    //three constructors
    public Employee(String n, double s) {
        this.name=n;
        this.salary=s;
    }
    public Employee (double s){
        this("Employee # ="+nextId, s);
    }
    public Employee() {}
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}

