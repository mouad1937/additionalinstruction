package organization;

public class Employee extends Person{
    private static int id=0;
    private int employeeId;

    public Employee(String name) {
        super(name);
        this.employeeId=++id;
    }
    public Employee(Cloth[] clothingItems){
        super(clothingItems);
    }


    public int getEmployeeId() {
        return employeeId;
    }
    public void printBadge(){
        System.out.println("Employee :" + getName() +
                "\n" + "Employee Id : " + getEmployeeId());

    }
}
