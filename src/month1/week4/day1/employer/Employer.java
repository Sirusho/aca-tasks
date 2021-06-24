package month1.week4.day1.employer;
/*
Define a Employer.java class which
Has  fields name, age, workPlace, salary.
define no argument constructor
define all argument constructor
write method which will print all information about employer
create 2 employer objects, print all info about them
create class definition diagram
 */
public class Employer {
    String name;
    int age;
    String workPlace;
    int salary;

    public Employer(){

    }
    public Employer(String name, int age, String workPlace, int salary) {
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }
    void printInfo(Employer employer){
        System.out.println(employer.name + " " + employer.age + " " + employer.workPlace + " " + employer.salary);
    }
}
