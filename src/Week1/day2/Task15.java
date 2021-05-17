package Week1.day2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean flag=number%2==1;
        System.out.println(flag);
    }
}
