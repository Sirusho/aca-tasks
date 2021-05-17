package Week3.Day3;
//????
import java.util.Scanner;

/*
.Write a function which returns the count of vowels of a given String
write also an overloaded function which returns count of constants.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println(countVowels(input));
        System.out.println(countVowels(input, 1));
    }
    static int countVowels(String str){
        str.toLowerCase();
        int count=0;
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='i' ){
               count++;
           }
        }
        return count;
    }
    static int countVowels(String str, int i){
        return str.length()-countVowels(str);
    }
}
