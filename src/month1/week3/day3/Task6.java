package month1.week3.Day3;
import java.util.Scanner;

/*
Write a program called countVowelsDigits,
 which get as parameter  a String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U)
 and digits (0-9) contained in the string, and prints the counts and the percentages
 (rounded to 2 decimal places).  For example`
 Enter a String: testing12345
Number of vowels: 2 (16.67%)
Number of digits: 5 (41.67%)
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        countVowelsDIgits(input);

    }
    static void countVowelsDIgits(String str){
        str.toLowerCase();
        int countVowels=0;
        int countDigits=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='i' ){
                countVowels++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
              countDigits++;
            }
        }
        System.out.println(" Number of vowels: " + countVowels + "(" + countVowels*100/str.length() + "%%" +  ")");
        System.out.println(" Number of digits: " + countDigits + "(" + countDigits*100/str.length() + "%%" +  ")");

    }

}
