package month1.week3.Day3;

import java.util.Scanner;

/*
The binary number system uses 2 symbols, 0 and 1.
 Write a function called checkBinStr to verify a binary string.
 The program shall prompt the user for a binary string;
  and decide if the input string is a valid binary string. For example,
Enter a binary string: 10101100
"10101100" is a binary string
Enter a binary string: 10120000
"10120000" is NOT a binary string
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        if (checkBinStr(input) == true) {
            System.out.println("\"" + input + "\" " + "is Binary");
        } else {
            System.out.println("\"" + input + "\" " + "is not Binary");
        }
    }
   static boolean checkBinStr(String str){
        boolean flag=true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1'){
            }else{
                flag=false;
            }
        }
        return flag;
   }
}
