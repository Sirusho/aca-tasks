package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function called bin2Dec to convert an input binary string into its equivalent decimal number.
 Your output shall look like:
Enter a Binary string: 1011
The equivalent decimal number for binary "1011" is: 11
Enter a Binary string: 1234
error: invalid binary string "1234"
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        bin2Dec(input);

    }

    static void bin2Dec(String string) {
        if (checkBinStr(string)) {
            System.out.println(calculateBinary(string));
        } else {
            System.out.println("\"" + string + "\"" + "is not a valid binary");
        }
    }

    static boolean checkBinStr(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1') {
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static int calculateBinary(String string) {
        int res = 0;
        for (int i = 0; i < string.length() ; i++) {
            if (string.charAt(i) == '0') {
                res += 0;
            } else {
                res += Math.pow(2, string.length() - i-1);
            }
        }
        return res;
    }
}
