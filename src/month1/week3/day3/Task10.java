package month1.week3.Day3;

import java.util.Scanner;

/*
The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f).
 Write a program to verify a hex string.
  The function gets a hex string; and decides if the input string is a valid hex string. For examples,
Enter a hex string: 123aBc
"123aBc" is a hex string
Enter a hex string: 123aBcx
"123aBcx" is NOT a hex string
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        String inputInsensitive=input.toUpperCase();
        if (isHex(inputInsensitive) == true) {
            System.out.println("\"" + input + "\" " + "is Hex");
        } else {
            System.out.println("\"" + input + "\" " + "is not Hex");
        }
    }

    static boolean isHex(String str) {
        boolean flag=true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 70) || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                flag= true;
            }else{
                flag=false;
            }
        }
        return flag;
    }
}
