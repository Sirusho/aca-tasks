package month1.week1.day4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;
        if (a == b && a == c && b == c) {
            count = 3;
        } else if (a == b) {
            count += 2;
        }
        if (b == c) {
            count += 2;
        }
        if (a == c) {
            count += 2;
        }
        System.out.println("Count of numbers with the same value -> " + count);
    }
}