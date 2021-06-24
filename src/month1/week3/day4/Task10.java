package month1.week3.Day4;

import java.util.Scanner;

/*
Given a string, return recursively a "cleaned" string where adjacent
chars that are the same have been reduced to a single char. So "yyzzza"
yields "yza".
EXample`
               stringClean("yyzzza") → "yza"
               stringClean("abbbcdd") → "abcd"

 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String input = scanner.nextLine();
        System.out.println(stringClean(input));
    }

    static String stringClean(String string) {

        if (string.length() == 0) {
            return "";
        } else if (string.substring(1).contains(string.charAt(0)+"")) {
            return stringClean(string.substring(1));
        } else {
            return string.charAt(0)+ stringClean(string.substring(1));
        }
    }
}
