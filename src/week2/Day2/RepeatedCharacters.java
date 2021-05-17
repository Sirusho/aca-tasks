package week2.Day2;

import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String text = scanner.nextLine();
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (newText.indexOf(text.charAt(i)) <0) {
                newText += text.charAt(i);
            }
        }
        System.out.println(newText);
    }
}

