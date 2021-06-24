package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function that returns the first non-repeated character from a given string.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String s = scanner.nextLine();
        findFirstNonRepeating(s);
    }
    static void findFirstNonRepeating(String string){
        for(int index=0; index<string.length(); index++){
            int count=0;
            for(int i=0; i<string.length(); i++) {
            if (string.charAt(index) != string.charAt(i) && index != i) {
                count++;
            }
            if (count == string.length() - 1) {
                System.out.println(string.charAt(index));
                return;
            }
        }
        }
    }
}
