package Week3.Day1;

import javax.swing.*;
import java.util.Scanner;

/*
Write a value-returning method,
 isVowel that returns the value
 true if a given character is a vowel, and otherwise returns false.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a character");
        char input = scanner.next().charAt(0);
        System.out.println(isVowel(input));

    }
    public static boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'A':
            case'e':
            case 'E':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            case 'I':
            case 'i':
                return true;
            default:
                return false;
        }
    }
}
