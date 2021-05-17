package Week3.Day4;

import java.util.Scanner;

/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
Example`
 countX("xxhixx") → 4
 countX("xhixhix") → 3
 countX("hi") → 0
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        String  str = scanner.nextLine();
        System.out.println(countX(str));

    }
    static int countX(String string){
        if(string.length()==0){
            return 0;
        }
        return (string.charAt(0)=='x'?1:0)+countX(string.substring(1));
    }
}
