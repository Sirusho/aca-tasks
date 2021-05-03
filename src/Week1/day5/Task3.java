package day5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
