package Week3.Day3;

import java.util.Scanner;

/*
Write a function that counts duplicate characters from a given string.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println( countDuplicate(input));
    }
    static int countDuplicate(String string){
        int count=0;
        String text=string;
        for(int i=0; i<string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j) && i != j) {
                    count++;
                }
            }
        }
        return count/2;
    }
}
