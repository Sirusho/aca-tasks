package month1.week3.Day1;

import java.util.Scanner;

/*
Write a function static double(double a, int n) calculating the value of a to the power of n
 */
public class PowerAOfN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Value");
        double num=scanner.nextDouble();
        System.out.println("Input power");
        int n = scanner.nextInt();
        System.out.println(power(num,n));

    }

    public static double power(double a, int n) {
        double res = 1.0;
        while (n > 0) {
            res *= a;
            n--;
        }
        return res;
    }
}
