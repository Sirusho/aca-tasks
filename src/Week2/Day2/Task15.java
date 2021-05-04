package Week2.Day2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input");
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(i*j + " ");
                    }
                    System.out.println("\n");
                }
                break;
            }
        }
    }
}
