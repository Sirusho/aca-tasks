package week2.Day5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 four-digit numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        for (int i = first; i < second; i++) {
            if ((i % 10 == i / 1000) && ((i / 100) % 10) == (i % 100) / 10) {
                System.out.println(i);
            }
        }
    }
}
