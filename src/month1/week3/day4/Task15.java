package month1.week3.Day4;

import java.util.Scanner;

/*
.Given a string containing only English letters (uppercase and lowercase).
 Add opening and closing parentheses according to the following pattern: "example" -> "(e (x (a (m) p) l) e)"
 (Added opening parentheses to the middle, closing parentheses after the middle.
  In case the string length is even there must be 2 characters in the brackets in the middle.
   ("card -> (c (ar) d" but not "(c (a () r) d)").
Example`
LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
L(I(t(B(e(o(F(L(c(S(G(B(O(F(Q(x(M(H(o(I)u)D)D)W)c)q)c)V)g)k)c)R)o)A)e)o)c)X)O
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n");
        String input = scanner.nextLine();
        System.out.println(addParentheses(input));
    }
    static String addParentheses(String string) {
        if (string.length() <= 2) {
            return "(" + string + ")";
        }
        return "(" + string.charAt(0) + addParentheses(string.substring(1, string.length() - 1))
                + string.charAt(string.length() - 1) + ")";
    }

}
