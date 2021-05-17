package Week1.day5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int max = first > second ? first : second;
        System.out.println("max = " + max);
    }
}
