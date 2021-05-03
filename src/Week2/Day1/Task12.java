package Week2.Day1;

import java.util.Scanner;

/*
Given integer number A > 1,define what is the Fibonacci number is A, i.e  print such number n that  φn=A.If A is not a Fibonacci number print -1. Example
Input 8
Output 6
Input 10
Output -1
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int a = 1;
        int b = 1;
        int c = a + b;
        int count = 2;
        while (c < num) {

            c = a + b;
            a = b;
            b = c;
            count++;
        }
        if (c == num) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}
