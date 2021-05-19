package week4.day1.arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        Long start = System.currentTimeMillis();
        int arr[] = new int[n];
        int i = 0;
        while (n > 0) {
            arr[i] = scanner.nextInt();
            i++;
            n--;
        }
        Arithmetic op = new Arithmetic(arr);
        op.options();
        Long end = System.currentTimeMillis();
        System.out.println("Program worked for " + (end - start) + " miliseconds");
    }
}
