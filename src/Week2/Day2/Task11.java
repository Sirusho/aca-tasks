package Week2.Day2;

import java.util.Scanner;

/*
.Enter the number N, followed by N integers.
Count how many zeros, positive numbers, negative numbers among the given N numbers.
It is necessary to print first the number of zeros, then the number of positive and negative numbers.

 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int count=0;
        int zeros=0;
        int positive=0;
        int negative=0;
            while (count<n){
                System.out.println("Input numbers");
                int input=scanner.nextInt();
                if(input==0){
                    zeros++;
                    count++;
                }else if(input>0){
                    positive++;
                    count++;
                }else{
                    negative++;
                    count++;
                }
        }
        System.out.println("zeros -> " + zeros + " positives -> " + positive + " negatives -> " + negative);
    }
}
