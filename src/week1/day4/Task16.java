package Week1.day4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input 3 numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d=Math.pow(b,2)-4*a*c;
        if(d<0){
            System.out.println("There is no D");
        }else if(d==0){
            System.out.println("There is one solution ->" + -b/2*a);
        }else{
            System.out.println("There are 2 solutions -> " + -b+Math.sqrt(d)/2*a + " -> " + (-b-Math.sqrt(d)/2*a));

        }


    }
}
