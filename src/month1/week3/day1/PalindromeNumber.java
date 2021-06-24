package month1.week3.Day1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a non negative integer");
        int input = scanner.nextInt();
        System.out.println("Is palindrome " + isPalindrome(input));
        System.out.println("Function works " + isCorrect(input, isPalindrome(input)));
    }
    public static boolean isPalindrome(int n){

        boolean flag=false;
        if(n>0){
            String text="" + n;
            String newText="";
            for(int i=text.length()-1; i>=0; i--){
                newText+=text.charAt(i);
            }
            if(text.equals(newText)){
                flag= true;
            }
        }else{
            System.out.println("Invalid input");
        }
        return flag;
    }

    public static boolean isCorrect(int n, boolean result){
        String text=""+ n;
        String newText="";
        boolean correct=false;
        for(int i=text.length()-1; i>=0; i--){
            newText+=text.charAt(i);
        }
        if(text.equals(newText)){
            correct=true;
        }
        if(correct==result){
            return true;
        }
        return false;
    }
}
