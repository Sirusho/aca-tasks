package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function to check if the passed String is palindrome or not
Print “xxx”  is|is not a Palindrome.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        if (isPalindrome(input) == true) {
            System.out.println("\"" + input + "\" " + "is Palindrome");
        } else {
            System.out.println("\"" + input + "\" " + "is not a Palindrome");
        }
    }
    static boolean isPalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        return(str.equals(stringBuilder.reverse().toString()));
    }

}
