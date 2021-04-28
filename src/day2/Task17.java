package com.company.Day2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The first digit is -> " + (number/100));
    }
}
