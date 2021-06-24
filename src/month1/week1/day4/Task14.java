package month1.week1.day4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a != 0 && b != 0 && c != 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("There is not a non degenerate triangle");
            } else {
                System.out.println("There is a non degenerate triangle");
            }
        } else {
            System.out.println("Side is 0");
        }
    }
}
