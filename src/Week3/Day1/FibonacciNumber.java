package Week3.Day1;

import java.util.Scanner;

/*
Write function int fib(int n), which for a given natural n returns  n th element.
Example Input` 3  Output` 2
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        int arr[]=new int[n];
        if(n==1){
            return 0;
        }
        int a=0;
        int b=1;
        for(int i=1; i<n; i++){
            arr[i]=a+b;
            a=b;
            b=arr[i];
        }
        return arr[n-1];
    }
}
