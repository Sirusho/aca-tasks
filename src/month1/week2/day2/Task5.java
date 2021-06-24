package month1.week2.Day2;

import java.util.Scanner;

/*
Given an integer number x
Print the number consisting of the digits of the given number x in reverse order.
 You do not need to output leading zeros.

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        int c;
        int y=x;
        int count=0;
        while (x>0){
            c=x%10;
            x=x/10;
            count++;
        }
        int res=0;
        while (count>=0){
            res+=(int)(y%10)*Math.pow(10,count-1);
            y=y/10;
            count--;
        }
        System.out.println(res);

    }
}
