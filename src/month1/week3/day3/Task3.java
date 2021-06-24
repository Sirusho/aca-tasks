package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function which checks if the given String contains a given character.
Pass as parameters String str, char ch
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println("Input a char");
        String charInput=scanner.nextLine();
        char c=charInput.charAt(0);
        System.out.println(contains(input, c));
    }
    public static boolean contains(String str, char ch){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
