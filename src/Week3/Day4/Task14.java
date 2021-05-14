package Week3.Day4;

import java.util.Scanner;

/*
Given a string containing only English letters (uppercase and lowercase). Add the ‘*’ (asterisk) character between letters (you don’t need to add ‘*’ before the first letter and after the last).
Example ` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*R*o*A*e*o*c*X*O
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n");
        String input = scanner.nextLine();
        System.out.println(addAsterisk(input));
    }

    static String newString = "";

    static String addAsterisk(String string) {
        if (string.length() == 0) {
            return newString;
        }
        if (string.length() == 1) {
            newString += string.charAt(0);
        } else {
            newString += string.charAt(0) + "*";
            return addAsterisk(string.substring(1));
        }
        return addAsterisk(string.substring(1));
    }
}
