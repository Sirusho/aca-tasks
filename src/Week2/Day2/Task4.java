package Week2.Day2;

import java.util.Scanner;

/*
Enters 2 integer numbers : x and d from console
Count and print one number - how many times the digit d occurs in the representation of a natural number x.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        System.out.println("Input d");
        int d=scanner.nextInt();
        int c;
        int count=0;
        while (x>0){
            c=x%10;
            if(c==d){
                count++;
            }
            x=x/10;
        }
        System.out.println(count);
    }
}
