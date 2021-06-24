package month1.week1.day4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int first = scanner.nextInt();
        System.out.println("Input second number");
        int second = scanner.nextInt();
        System.out.println("Input third number");
        int third = scanner.nextInt();

        int max = first;
        if (second > max && second > third) {
            max = second;
        } else if (third > max && third > second) {
            max = third;
        }
        System.out.println("max = " + max);

    }
}
