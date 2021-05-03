package com.company.day3;

import java.util.Scanner;

public class WideningCast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        byte byteNumber = scanner.nextByte();
        short shortNumber = byteNumber;
        System.out.println("byte number -> " + byteNumber + " short number -> " + shortNumber);
        int intNumber = shortNumber;
        System.out.println("short number -> " + shortNumber + " int number -> " + intNumber);
        long longNumber = intNumber;
        System.out.println("int number -> " + intNumber + " long number -> " + longNumber);
        float floatNumber = longNumber;
        System.out.println("long number -> " + longNumber + " float number -> " + floatNumber);
        double doubleNumber = floatNumber;
        System.out.println("float number -> " + floatNumber + " double number -> " + doubleNumber);


    }
}
