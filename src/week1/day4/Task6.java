package Week1.day4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a floating point number");
        float number = scanner.nextFloat();
        if(number==0){
            System.out.println("Number is 0");
        }else if(number>0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
        if(Math.abs(number)<1){
            System.out.println("Small");
        }else if(Math.abs(number)>1000000){
            System.out.println("Big");
        }


    }
}
