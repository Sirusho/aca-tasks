package month1.week3.Day4;

import java.util.Scanner;

/*
Given a string, compute recursively a new string where all the 'x' chars
have been removed.
Use`  str.substring()
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        String  str = scanner.nextLine();
        System.out.println(removeX(str));
    }
    static String removeX(String string){
        if(string.length()==0){
            return "";
        }
        return (string.charAt(0)=='x'?"":string.substring(0,1))+removeX(string.substring(1));
    }

}
