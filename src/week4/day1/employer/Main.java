package week4.day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employer task \n" );
        Employer employer=new Employer("Ann", 25, "Google", 5600);
        Employer employer1=new Employer("John", 30, "Microsoft", 7000);
        employer.printInfo(employer);
        employer1.printInfo(employer1);

        System.out.println("");
        System.out.println("Shop Task \n");
        Shop shop=new Shop("Zara", "Address 1", 15, 150, 50);
        Shop shop1=new Shop("DG", "Address 2", 200, 10000, 50000);
        shop.checkOrder(10);

    }
}
