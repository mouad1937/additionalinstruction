package organization;

public class Person {
    private String name;
    private Cloth[] clothingItems;


    public Person(String name) {
        this.name = name;
    }
    public Person(Cloth[] clothingItems){
        this.clothingItems=clothingItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printPay(Person[] people){
        for (Person person : people) {
            if (person instanceof HourlyEmployee) {
                HourlyEmployee hourlyEmployee = (HourlyEmployee) person;
                System.out.println("Hourly Employee's Pay is : " + hourlyEmployee.hourlyEmployeeIncome());
            } else if (person instanceof SalariedEmployee) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) person;
                System.out.println("Salaried Employee's Pay is : " + salariedEmployee.getSalary());
            } else if (person instanceof Entrepreneur) {
                Entrepreneur entrepreneur = (Entrepreneur) person;
                System.out.println("Entrepreneur's Pay is : "+ entrepreneur.calculatePay());}
        }
    }



    public double getTotalCost(String personType) {
        double totalCost = 0.0;
        for (Cloth cloth : clothingItems)
            totalCost +=cloth.calculateDiscount(personType)  ;

        return totalCost;
    }




//    public double calculateDiscount(){
//        double totalDiscountAmount = 0.0;
//        double discountPercentage= 0.1;
//for (Cloth item : this.clothingItems){
//    double discountAmount = calculateDiscount() * discountPercentage;
//  totalDiscountAmount+=discountPercentage;
//}  return totalDiscountAmount();
//    }
//
//    private double totalDiscountAmount() {
//        return 0;
//    }




}
