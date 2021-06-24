package month1.week4.day1.university;

import java.util.Scanner;

/*
Define a University.java class
define fields ` name, countOfStudents, maxCountOfStudents
maxAgeOfStudent, minAgeOfStudent
write a function to print all info about university` printInfo()
write a function checkAge(int age) to check if the student's age is valid.
write a function admission() (Ընդունելություն) , which will suggest what kind of courses your university has. like this`
“Applied Mathematics -- 1”
“Computer science -- 2”
etc..
then give an ability for user to choose which profession he/ she wants,
 */
public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudents;
    int minAgeOfStudents;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudents = maxAgeOfStudents;
        this.minAgeOfStudents = minAgeOfStudents;
    }

    void printInfo(University university) {
        System.out.println(university.name + " Students count -> " + university.countOfStudents +
                " Max Students count -> " + university.maxCountOfStudents + "Max Age of Students -> "
                + university.maxAgeOfStudents + " Min age of students -> " + university.minAgeOfStudents);
    }

    boolean isValidAge(int age) {
        if (age >= minAgeOfStudents && age <= maxAgeOfStudents) {
            System.out.println("You've registered");
            countOfStudents++;
            return true;
        }
        System.out.println("You can't register");
        return false;
    }

    void admission() {
        System.out.println("Applied Mathematics -- 1 \n" +
                "Computer science -- 2 \n" + "Business -- 3 \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your profession");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
            case "2":
            case "3":
                System.out.println("Input your age");
                int age = scanner.nextInt();
                isValidAge(age);
        }
    }

    void addRegister() {
        countOfStudents++;
    }
}
