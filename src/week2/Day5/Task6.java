package week2.Day5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3-letter word");
        String input = scanner.nextLine();
        char first = input.charAt(0);
        String res = "";
        if (first >= 97 && first <= 122) {
            first -= 32;
        }
        res = input.toLowerCase();
        res = res.replace(res.charAt(0), first);
        System.out.println(res);
    }

}
