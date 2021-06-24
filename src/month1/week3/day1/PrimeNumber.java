package month1.week3.Day1;

import java.util.Scanner;

/*
Write a function static boolean isPrime(int n),
where n != 1 and n < 20000000, which return true if n is prime else false.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
