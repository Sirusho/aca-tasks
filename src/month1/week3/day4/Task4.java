package month1.week3.Day4;

import java.util.Scanner;

/*
Given a non-negative int n, return the sum of its digits recursively (no
loops).
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+ sumOfDigits(n/10) ;
    }
}
