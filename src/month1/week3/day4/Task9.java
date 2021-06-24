package month1.week3.Day4;

import java.util.Scanner;

/*
Given a string, compute recursively a new string
 where all the lowercase 'x' chars have been moved to the end of the string.
Example`
                 endX("xxre") → "rexx"
                 endX("xxhixx") → "hixxxx"
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String input = scanner.nextLine();
        System.out.println(endX(input));
    }

    static int count = 0;
    static StringBuilder stringBuilder = new StringBuilder("");

//    static String endX(String string) {
//        if (string.length() == 0) {
//            while (count > 0) {
//                stringBuilder.append("x");
//                count--;
//            }
//            return stringBuilder.toString();
//        } else if (string.charAt(0) == 'x') {
//            count++;
//
//        } else {
//            stringBuilder.append(string.charAt(0));
//        }
//        return endX(string.substring(1));
//
//    }
    //dxexe
    //


    static String endX(String str){
        if(str.length() == 1){
            return str;
        }else if(str.charAt(0) == 'x'){
            return endX(str.substring(1)) + 'x';
        } return str.charAt(0)+ endX(str.substring(1));
    }



}
