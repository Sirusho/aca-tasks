package com.company.Day2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The second digit is -> " + (number/10)%10);
    }
}
