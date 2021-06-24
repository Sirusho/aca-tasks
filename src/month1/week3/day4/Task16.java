package month1.week3.Day4;

import java.util.Scanner;

/*
Given a string containing only English letters (uppercase and lowercase) and opening brackets.
 Form a new line by adding a "mirrored" line with closing brackets to the right.
 (abc (def (g " -> "(abc (def (gg) fed) cba)
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a string");
        String input = scanner.nextLine();
        System.out.println(reverseBrackets(input));
    }
    static String reverseBrackets(String str){
        if(str.length()==1){
            return str+ str;
        }
        return str.charAt(0)+ reverseBrackets(str.substring(1)) + (str.charAt(0)=='('?')':str.charAt(0));
    }
}
