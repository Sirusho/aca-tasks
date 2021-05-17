package week2.Day2;

import java.util.Scanner;

/*
Integers a and b are entered. It is guaranteed that a does not   exceed b.
Print all numbers on the segment from a to b that are exact squares. If there are no such numbers, then you do not need to display anything.
Example`
Input` 2    Output ` 4
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        for(int i=a; i<=b; i++){
            for(int j=1; j<=b; j++){
                if(j*j==i){
                    System.out.println(i);
                }
            }
        }
    }
}
