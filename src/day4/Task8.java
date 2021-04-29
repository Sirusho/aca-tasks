package day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        if (number % 8 == 0) {
            System.out.println("Yes");
        } else if (number % 3 == 2) {
            System.out.println("Yes");
        } else if (number % 5 == 3) {
            System.out.println("Yes");
        } else if (number % 3 == 0) {
            System.out.println("Yes");
        } else if (number % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
