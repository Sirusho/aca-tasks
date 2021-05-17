package week2.Day1;

import java.util.Scanner;

/*
15.The sequence consists of different natural numbers and ends with the number 0.
 Determine the value of the second largest element in this sequence.
(A sequence of natural numbers is introduced, ending with the number 0
 (the number 0 itself is not included in the sequence, but serves as a sign of its termination)).
Input `    1         Output` 7
           7
           9
           0
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int secondMax = 0;
        while (true) {
            System.out.println("Input a number");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}
