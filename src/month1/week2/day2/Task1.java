package month1.week2.Day2;

import java.util.Scanner;

/*
Write a java program to print all even numbers from a given range, from a to b. Input a and b from console.Example`
Input ` 2      Output ` 2 4
           5
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input lower bound");
        int lowerBound = scanner.nextInt();
        System.out.println("Input upper bound");
        int upperBound = scanner.nextInt();
        for (int i=lowerBound; i<=upperBound; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
