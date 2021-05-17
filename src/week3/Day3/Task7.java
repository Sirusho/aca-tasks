package Week3.Day3;

import java.util.Scanner;

/*
Write a function called caesarCode to cipher Caesar's code.
 The program shall prompt the user for a plaintext string consisting of mix-case letters only;
  compute the ciphertext; and print the ciphertext in uppercase. For example,
Enter a plaintext string: Testing
The ciphertext string is: WHVWLQJ
Hints
Use in.next().toUpperCase() to read an input string and convert it into uppercase to reduce the number of cases.
You can use a big nested-if with 26 cases ('A'-'Z'). But it is much better to consider 'A' to 'W' as one case; 'X', 'Y' and 'Z' as 3 separate cases.
 */
//65-90
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String input = scanner.nextLine().toUpperCase();
        System.out.println(caesarCode(input));
    }

    static String caesarCode(String s) {
        String newText = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'X') {
                c = 'A';
            } else if (c == 'Y') {
                c = 'B';
            } else if (c == 'Z') {
                c = 'C';
            } else {
                c += 3 % (s.charAt(i) + 32);
            }
            newText += c;
        }
        return newText;
    }
}
