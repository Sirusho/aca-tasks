package day5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int input = scanner.nextInt();
        switch (input % 2) {
            case 0:
                System.out.println("The number is even");
                break;
            default:
                System.out.println("The number is odd");
        }
    }
}
