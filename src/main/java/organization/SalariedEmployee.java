package organization;

public class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String name) {
        super(name);
        this.salary=salary;
    }

    public void printBadge(){
        System.out.println("SalariedEmployee: " + getName() + '\n'+
                "EmployeeID: " + getEmployeeId());    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printPay(){
        System.out.println("SalariedEmployee{" + " name is : "+ getName()+ ","+" his income is : "+ getSalary()+ '}' );
    }


}
