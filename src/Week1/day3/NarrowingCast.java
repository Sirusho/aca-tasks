package Week1.day3;

import java.util.Scanner;

public class NarrowingCast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        double doubleNumber = scanner.nextDouble();
        float floatNumber = (float) doubleNumber;
        System.out.println("float number -> " + floatNumber + " double number -> " + doubleNumber);
        long longNumber = (long) floatNumber;
        System.out.println("long number -> " + longNumber + " float number -> " + floatNumber);
        int intNumber = (int) longNumber;
        System.out.println("int number -> " + intNumber + " long number -> " + longNumber);
        short shortNumber = (short) intNumber;
        System.out.println("short number -> " + shortNumber + " int number -> " + intNumber);
        byte byteNumber = (byte) shortNumber;
        System.out.println("short number -> " + shortNumber + " byte number -> " + byteNumber);


    }
}
