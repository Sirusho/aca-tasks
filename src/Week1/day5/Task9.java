package Week1.day5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the correct way to declare a variable to store an integer value in Java?\n");
        System.out.println("a. int 1x=10");
        System.out.println("b. int x=10");
        System.out.println("c. float x=10.0f");
        System.out.println("d. string x=\"10\"");
        String input = scanner.nextLine();
        switch (input) {
            case "c":
                System.out.println("Congrats");
                break;
            default:
                System.out.println("Wrong answer");
        }
    }
}
