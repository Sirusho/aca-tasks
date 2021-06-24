package month1.week3.Day4;

import java.util.Scanner;

/*
Write a fib(int) function which returns n-th fibonacci number.
 *///
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
