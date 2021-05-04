package Week2.Day2;

import java.util.Scanner;

/*
Given an integer number x
Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
Example`
       Input`  6   Output` 2
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        for(int i=2; i<=x/2; i++){
            if(x%i==0){
                System.out.println(i);
                break;
            }
        }

    }
}
