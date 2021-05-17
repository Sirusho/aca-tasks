package Week1.day3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        long first = scanner.nextLong();
        System.out.println("Input second number");
        long second = scanner.nextLong();
        boolean flag;

        String firstString = String.valueOf(first);
        String secondString = String.valueOf(second);
        flag = firstString.charAt(firstString.length() / 2) == secondString.charAt(secondString.length() / 2);
        System.out.println(!flag);

    }
}
