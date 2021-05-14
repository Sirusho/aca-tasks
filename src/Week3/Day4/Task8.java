package Week3.Day4;

import java.util.Scanner;

/*
Write recursive function that reverses the given String.
Example` HELLO -> OLLEH
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        String  str = scanner.nextLine();
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        return reverse(str.substring(1))+ str.charAt(0);
    }
}
