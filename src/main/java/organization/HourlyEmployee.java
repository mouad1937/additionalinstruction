package organization;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void printBadge(){
        System.out.println("HourlyEmployee: " + getName() + '\n' +
                "EmployeeID: " + getEmployeeId()   );
    }

    public double getHourlyRate() {
        return hourlyRate ;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double hourlyEmployeeIncome(){
        return hourlyRate*hoursWorked;

    }
    public void printPay(){
        System.out.println( "HourlyEmployee{" + " name is : "+ getName()+ ","+" his income is : "+ hourlyEmployeeIncome()+ '}' );
    }

}
