package week2.Day2;

import java.util.Scanner;

public class Task16A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input");
            } else {
                for (int i = 1; i <= n; i++) {
                    int j = i;
                    while (j >= 1) {
                        System.out.print("*" + " ");
                        j--;
                    }
                    System.out.println("");
                }
                break;
            }
        }
    }
}
