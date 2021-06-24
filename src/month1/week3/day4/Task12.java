package month1.week3.Day4;

import java.util.Scanner;

/*
Given a string containing only decimal digits. Find and display the largest digit.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        String input = scanner.nextLine();
        System.out.println(largestDigit(input));

    }
    static int max=Integer.MIN_VALUE;
    static int largestDigit(String string){
        if(string.length()==0){
            return max;
        }
        if(Integer.parseInt(string.charAt(0) + "") > max){
            max=Integer.parseInt(string.charAt(0) + "");
        }
        return largestDigit(string.substring(1));
    }
}
