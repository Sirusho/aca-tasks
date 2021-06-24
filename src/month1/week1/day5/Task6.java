package month1.week1.day5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        int abs = number > 0 ? number : number * -1;
        System.out.println("absolute value is " + abs);

    }
}
