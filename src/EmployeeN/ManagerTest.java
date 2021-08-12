package EmployeeN;

public class ManagerTest  {
    public static void main(String[] args) {
        Manager boss=new Manager("Carl",80000,2019,03,17);
         boss.setBonus(5000);

        EmployeeN staff[]=new EmployeeN[3];
        staff[0]=boss;
        staff[1]=new EmployeeN("Fedor", 90000,2018,12,12);
        staff[2]=new EmployeeN("Kristina",90000,2016,10,10);

        for (EmployeeN employeeN:staff){
            System.out.println("name: "+employeeN.getName() + ". salary: "+ employeeN.getSalary());
        }
    }
}
