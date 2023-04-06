package organization;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike" ,10.00,60.0);
        hourlyEmployee.printBadge();
//hourlyEmployee.printPay();

//              System.out.println( hourlyEmployee.calculateDiscount());;
       SalariedEmployee salariedEmployee=new SalariedEmployee("Mouad");
        salariedEmployee.setSalary(2000.0);
        salariedEmployee.printBadge();
//salariedEmployee.printPay();
//        salariedEmployee.calculateDiscount();

        Entrepreneur entrepreneur1=new Entrepreneur("steve",2000.0,500.0);
        System.out.println(entrepreneur1.printPay());
        Person[] people={hourlyEmployee,salariedEmployee,entrepreneur1};
        Person.printPay(people);
//        entrepreneur.calculateDiscount();



//        Manager manager= new Manager("manager");
//


//
//        Cloth[] employeeCloths= { new Cloth("Dresses",30.0),new Cloth("Tops",35.0)};
//        Person employee = new Person(employeeCloths);
//        System.out.println("The total cost of an employee is " +employee.getTotalCost("employee"));
//
//
//        Cloth[] entrepreneurCloths= { new Cloth("Pants",25.0),new Cloth("Tops",40.0)};
//        Person entrepreneur = new Person(entrepreneurCloths);
//        System.out.println("The total cost of an employee is " +entrepreneur.getTotalCost("entrepreneur"));
//
//        Cloth[] managerCloths= { new Cloth("Pants",5.0),new Cloth("Tops",20.0)};
//   Person manager1 = new Person(managerCloths);
//        System.out.println("The total cost of an employee is " +manager.getTotalCost("manager"));

        Cloth[] employeeClothes = {new Cloth("Shirt", 20.0), new Cloth("Pants", 30.0)};
        Person employee = new Person(employeeClothes);
        System.out.println("Total cost for employee: " + employee.getTotalCost("employee"));

        Cloth[] managerClothes = {new Cloth("Dress", 50.0), new Cloth("Suit", 100.0)};
        Person manager = new Person(managerClothes);
        System.out.println("Total cost for manager: " + manager.getTotalCost("manager"));



        Cloth[] entrepreneurClothes = {new Cloth("T-Shirt", 15.0), new Cloth("Shorts", 25.0)};
        Person entrepreneur = new Person(entrepreneurClothes);
        System.out.println("Total cost for entrepreneur: " + entrepreneur.getTotalCost("entrepreneur"));




    }







    }

