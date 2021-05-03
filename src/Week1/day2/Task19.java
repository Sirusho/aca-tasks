package com.company.Day2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second=scanner.nextInt();
        first=second+first;
        second=first-second;
        first=first-second;
        System.out.println("first -> " + first);
        System.out.println("second -> " + second);
    }
}
