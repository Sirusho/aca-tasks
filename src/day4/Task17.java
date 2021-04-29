package day4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        }else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        }else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        }else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        }else if (c <= a && a <= b) {
            System.out.println(c + " " + b + " " + a);
        } else {
            System.out.println(c + " " + a + " " + b);
        }
    }
}
