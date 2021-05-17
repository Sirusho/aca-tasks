package week2.Day2;
/*
Convert a natural number from binary to decimal  (no more than 10 digits in a binary number).
Example` Input ` 1001   Output` 9
                            111     Output` 7
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        int c;
        int res = 0;
        int count = 0;
        while (x > 0) {
            c = x % 10;
            res += c * (int) Math.pow(2, count);
            count++;
            x = x / 10;
        }
        System.out.println(res);
    }
}
