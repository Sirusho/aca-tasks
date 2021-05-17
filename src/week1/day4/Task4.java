package Week1.day4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("Number is multiple of 5");
        } else {
            System.out.println("Number is not multiple of 5");
        }
    }
}
