package month1.week1.day4;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Number is neither even nor odd");
        } else if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
