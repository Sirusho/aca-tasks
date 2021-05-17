package Week1.day3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year of your birth");
        int year = scanner.nextInt();
        char a = 'J';
        char b = 'o';
        char c = 'h';
        char d = 'n';
        String name = "" + a + b + c + d;
        System.out.println(name + " " + year);

    }
}
