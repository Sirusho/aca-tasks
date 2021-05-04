package Week2.Day2;

import java.util.Scanner;

/*
 Write a program to check the validity of password input by users. Validation :
At least 1 letter between [a-z] and 1 letter between [A-Z].
At least 1 number between [0-9].
At least 1 character from [$#@].
Minimum length 6 characters.
Maximum length 16 characters.
Example`  12asdf                        Invalid
                  Aaza1234566#          Valid
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password");
        String pass = scanner.nextLine();
        int upperLetters = 0;
        int lowerLetters = 0;
        int characters = 0;
        int numbers = 0;
        if (pass.length() >= 6 && pass.length() <= 16) {
            for (int i = 0; i < pass.length(); i++) {
                if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                    numbers++;
                } else if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) {
                    upperLetters++;
                } else if (pass.charAt(i) >= 97 && pass.charAt(i) <= 122) {
                    lowerLetters++;
                } else if (pass.charAt(i) == 40 || pass.charAt(i) == 23 || pass.charAt(i) == 24) {
                    characters++;
                }
            }
            if (numbers >= 1 && upperLetters >= 1 && lowerLetters >= 1 && characters >= 1) {
                System.out.println("Done");
            }else{
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid password");
        }
    }
}
