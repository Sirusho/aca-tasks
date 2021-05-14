package Week3.Day4;

import java.util.Scanner;

/*
You are given a string containing numbers and English letters (uppercase and lowercase).
 Find and display the number of digits.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        String input = scanner.nextLine();
        System.out.println(numberOfDigits(input));
    }
    static int count=0;
    static int numberOfDigits(String string){
        if(string.equals("")){
            return count;
        }
         else if(string.charAt(0)>='0'  && string.charAt(0)<='9'){
            count++;
           return numberOfDigits(string.substring(1));
        }
         return numberOfDigits(string.substring(1));
    }
}
