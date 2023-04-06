package organization;

public class Entrepreneur extends Person{
    private double revenue;
    private double expenses;
    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
        this.revenue= revenue;
        this.expenses = expenses;
    }
    public double calculatePay (){
        return revenue-expenses;
    }
public Entrepreneur(Cloth[] clothingItems){
        super(clothingItems);
}
    public double getRevenue() {
        return revenue;
    }

    public double getExpenses() {
        return expenses;
    }



    public String printPay() {
        return "Entrepreneur{" + " name is "+ getName()+
                " , revenue is " + revenue +
                ", expenses are " + expenses +
                '}';
    }



}
