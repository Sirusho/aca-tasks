package week4.day1.employer;

import week4.day1.employer.Employer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employer task \n" );
        Employer employer=new Employer("Ann", 25, "Google", 5600);
        Employer employer1=new Employer("John", 30, "Microsoft", 7000);
        employer.printInfo(employer);
        employer1.printInfo(employer1);

    }
}
