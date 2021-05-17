package Week3.Day3;

import java.util.Scanner;

/*
Write a function that counts occurrences of a certain character in a given string.
Pass as a argument (String str, char ch)
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println("Input a char");
        char c=scanner.nextLine().charAt(0);
        System.out.println(findOccurrences(input, c));
    }
    static int findOccurrences(String str, char ch){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
