package Week3.Day4;

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
    static StringBuilder newText=new StringBuilder("");
    static int i=0;
    static String addParentheses(String string){
        if(string.length()%2==0){

        }
        if(string.length()== string.length()/2){
            return newText.toString();
        }
        //abcde (a (b(c)d)
        if(i<string.length()/2){
            newText.append("(" + string.charAt(0));
            return addParentheses(string.substring(1));
        }else if(i>=(string.length()/2) && i<string.length()){
            newText.append(")" + string.charAt(0) + ")");
            return addParentheses(string.substring(1));
        }
        i++;
        return newText.toString();
    }

}
