package month1.week1.day2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        System.out.println("the remainder is -> " + firstNumber%secondNumber);
    }
}
