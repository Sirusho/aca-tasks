package Week1.day4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }

        if (a > 0 && b > 0) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }
        if (a < 0 && b < 0) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }

        if (a > 0 && b <1 && a%2==1 && b%2==1) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }
        if (a %5== 0 && b%5== 0) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }

        if (a %5== 0 && b %5!=0) {
            System.out.println("both a and b legal");
        } else {
            System.out.println("both a and b illegal");
        }



    }
}
