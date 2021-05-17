package Week1.day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 100) {
            System.out.println("10 -> 100");
        } else if (number >= 200 && number <= 300) {
            System.out.println("200 -> 300");
        } else if (number > 300 && number <= 500) {
            System.out.println("301-> 500");
        } else {
            System.out.println("Number is not in any range");
        }

    }
}
