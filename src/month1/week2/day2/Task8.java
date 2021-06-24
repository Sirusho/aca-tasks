package month1.week2.Day2;

import java.util.Scanner;

/*
Given an integer x
Count the number of natural divisors of x (including 1 and the number itself; x≤2 ∗ 109).

 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print( i + " ");
                count++;
            }
        }
        System.out.println("count =" + count);
    }
}
