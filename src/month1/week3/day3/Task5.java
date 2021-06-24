package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function called reverseString,
 which prompts the user for a String,
  and prints the reverse of the String by extracting and processing each character.
   The output shall look like:
Enter a String: abcdef
The reverse of the String "abcdef" is "fedcba
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println("The reverse of the String" + " " + "\"" +   input +"\"" +" " +  "is " +  "\"" +  reverseString(input) +  "\"" ) ;
    }
    static String reverseString(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
