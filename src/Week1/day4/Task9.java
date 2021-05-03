package day4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
