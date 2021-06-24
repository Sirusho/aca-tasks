package month1.week3.Day5;

import java.util.Scanner;

/*
11. Guessing number from 1 to 100 with maximum 7 guesses or less.
Keep in mind one integer value from 1 to 100
 write a program that will guess that number.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(guessNumber(1, 100, num));
        System.out.println("count = " + stepCount);
    }
    static int stepCount=0;
    static int guessNumber(int start, int end, int number){
        stepCount++;
        System.out.print("start = " + start);
        System.out.println(" end = " + end);
        int mid=(start+end)/2;
        if(number==mid){
            return number;
        }
        if(number>mid){
            start=mid+1;
        }else{
            end=mid-1;
        }
        return guessNumber(start, end, number);

    }
}
