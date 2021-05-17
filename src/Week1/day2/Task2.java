package Week1.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of minutes");
        int minutes=scanner.nextInt();
        System.out.println(minutes/60 + " hour(s) " + minutes%60 + " minute(s)" );
    }
}
