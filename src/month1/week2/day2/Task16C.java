package month1.week2.Day2;

import java.util.Scanner;

public class Task16C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input");
            } else {
                for (int i = n; i > 0 ; i--) {
                    for (int j = n; j > 0; j--) {
                        if (i < j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
        }
    }
}
