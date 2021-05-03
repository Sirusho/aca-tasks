package day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
            if (n == 4 || n == 7 || n == 1 || n==2) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

