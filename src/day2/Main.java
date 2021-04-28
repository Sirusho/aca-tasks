package com.company.Day2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task 2
    /*    Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of minutes");
        int minutes=scanner.nextInt();

        int hours;
        System.out.println(minutes/60 + " hour(s) " + minutes%60 + " minute(s)" );
     */

        //Task 3
        /*
          int sumOdd=1+3+5+7;
          int sumEven=2+4+6+8;
        System.out.println("Sum of first 4 consecutive odd numbers -> " + sumOdd );
        System.out.println("Sum of first 4 consecutive even numbers -> " + sumEven);
      */

      //Task 4
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        System.out.println("the product of two numbers is -> " + firstNumber*secondNumber);
        */

       //Task 5
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        System.out.println("the remainder is -> " + firstNumber%secondNumber);

         */

        //Task 6
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber=scanner.nextInt();

        System.out.println("The sum is -> " + (firstNumber+secondNumber+thirdNumber));
        System.out.println("The difference is -> " + (firstNumber-secondNumber-thirdNumber));
        System.out.println("The product is -> " + (firstNumber*secondNumber*thirdNumber));

         */
        //Task 7
        /*int triangleBase=3;
        int triangleHeight=4;
        int squareHeight=6;
        int rectangleHeight=5;
        int rectangleWidth=3;
        System.out.println("Area of triangle is -> " + (triangleBase*triangleHeight)/2);
        System.out.println("Area of a square is -> " + squareHeight*squareHeight);
        System.out.println("Area of rectangle is -> " + rectangleHeight*rectangleWidth);

        */
        //Task 8
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        byte secondNumber=scanner.nextByte();
        System.out.println("Enter third number");
        short thirdNumber=scanner.nextShort();
        System.out.println("The average of numbers is -> " + (firstNumber+secondNumber+thirdNumber)/3);
        System.out.println("The product of numbers is -> " + firstNumber*secondNumber*thirdNumber );

        */
        //Task 9
        /*
        int n =10;
        int n_2=15;
        int S10=3*n*n-12*n;
        int S15=3*n_2*n_2-12*n_2;
        System.out.println("S10 = " + S10);
        System.out.println("S15 = " + S15);
         */

        //Task 10
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("The last digit is -> " + number%10);

        */

        //Task 11
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b=scanner.nextInt();
        System.out.println("The remainder is -> " + a%b);

        */

        //Task 12
        /*
        Random random=new Random();
        System.out.println(random.nextInt());

        */

        //Task 13
        /*
        Random random=new Random();
        System.out.println(random.nextInt(15));

        */

        //Task 14
        /*
        Random random=new Random();
        System.out.println(random.nextInt(30-15)+15);

        */

        //Task 15
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean flag=number%2==1;
        System.out.println(flag);

        */

        //Task 16
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The second digit is -> " + (number/10)%10);
        */

        //Task 17
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The first digit is -> " + (number/100));

        */

        //Task 18
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The sum of digits is -> " + ((number/100)+(number/10)%10+number%10));
        */

        //Task 19
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second=scanner.nextInt();
        first=second+first;
        second=first-second;
        first=first-second;
        System.out.println("first -> " + first);
        System.out.println("second -> " + second);



    }
}