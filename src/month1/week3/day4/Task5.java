package month1.week3.Day4;

import java.util.Scanner;

/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        int n = scanner.nextInt();
        System.out.println(countOfSeven(n));
    }
    static int countOfSeven(int n){
        if(n==0){
            return 0;
        }
        /*if(n%10==7){
            return 1+countOfSeven(n/10);
        }
        return countOfSeven(n/10);

         */
        return (n%10==7?1:0)+countOfSeven(n/10);
    }

}
