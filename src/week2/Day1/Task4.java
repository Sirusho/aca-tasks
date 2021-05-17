package week2.Day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int i=2;
        while (num%i!=0){
            i++;
        }
        System.out.println(i);
    }
}
