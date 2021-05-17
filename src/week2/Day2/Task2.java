package week2.Day2;

import java.util.Scanner;

/*
Print all numbers on the segment from a to b that give the remainder of c when divided by d. If such numbers do not exist, then you do not need to display anything.
Example ` Input`     Output`
                  a      2                2   4
                  b      5
                  c      0
                  d      2
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b=scanner.nextInt();
        System.out.println("Input c");
        int c=scanner.nextInt();
        System.out.println("Input d");
        int d=scanner.nextInt();
        int count=0;
        for(int i=a; i<=b; i++){
            if(i%c==d){
                System.out.print(i + " ");
                count++;
            }
        }
        if(count==0){
            System.out.println("There is no such number");
        }
    }
}
