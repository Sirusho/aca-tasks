package month1.week1.day2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        byte secondNumber=scanner.nextByte();
        System.out.println("Enter third number");
        short thirdNumber=scanner.nextShort();
        System.out.println("The average of numbers is -> " + (firstNumber+secondNumber+thirdNumber)/3);
        System.out.println("The product of numbers is -> " + firstNumber*secondNumber*thirdNumber );
    }
}
