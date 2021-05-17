package week2.Day2;

import java.util.Scanner;

/*
Calculate the sum of the given 10 natural numbers
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        int sum=0;
        int count=0;
        while(count<10) {
            System.out.println("Input a number");
            int x = scanner.nextInt();
            sum += x;
            count++;
        }
        System.out.println(sum);

    }
}
