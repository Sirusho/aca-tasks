package month1.week1.day2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber=scanner.nextInt();

        System.out.println("The sum is -> " + (firstNumber+secondNumber+thirdNumber));
        System.out.println("The difference is -> " + (firstNumber-secondNumber-thirdNumber));
        System.out.println("The product is -> " + (firstNumber*secondNumber*thirdNumber));
    }
}
