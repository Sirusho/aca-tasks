package Week3.Day4;

import java.util.Scanner;

/*
Write a function to determine if a number is prime or not.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int input = scanner.nextInt();
        System.out.println(isPrime(input, 2));
    }

    static boolean isPrime(int num, int i) {
        if (i == num / 2) {
            return true;
        } else if (num % i == 0) {
            return false;
        } else {
            i++;
            return isPrime(num, i);
        }
    }
}
