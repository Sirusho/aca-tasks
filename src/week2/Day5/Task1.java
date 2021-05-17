package week2.Day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 power with ");
        int n = scanner.nextInt();
        int count = 0;
        int product = 1;
        if (n >= 0 && n <= 15) {
            while (count < n) {
                product *= 2;
                count++;
            }
            System.out.println(product);
        } else {
            System.out.println("invalid input");
        }
    }
}
