package Week3.Day1;

import java.util.Scanner;

/*
Write a function int factorial(int a), which return factorial of a
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int a){
        int res=1;
        while (a>0){
            res*=a;
            a--;
        }
        return res;
    }
}
