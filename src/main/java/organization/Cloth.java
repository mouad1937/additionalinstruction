package organization;

public class Cloth  {
    private String description;
    private static double price;

public Cloth(String description,
             double price) {
    this.description = description;
    this.price = price;
}
//public  double calculateDiscount(Person people){
//    double discountPercentage=0.0;
//    if ( people instanceof Employee ){
//        discountPercentage=0.1;
//    } else if (people instanceof Entrepreneur) {
//        discountPercentage=0.02;
//    } else if (people instanceof Manager) {
//        discountPercentage=0.15;
//    }
//    double discountAmount=price* discountPercentage ;
//    double discountPrice =price-discountAmount;
//    return discountPrice;}
// we can use switch instead of If statement}


    public double calculateDiscount(String personType) {
        double discount = 0.0;
        switch (personType) {
            case "employee":
                discount = 0.1;
                break;
            case "manager":
                discount = 0.15;
                break;
            case "entrepreneur":
                discount = 0.02;
                break;
            default:
                break;
        }
        return price *  (1 - discount);
    }







}
