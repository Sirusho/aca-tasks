package Week1.day5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a letter");
        char c = sc.next().toUpperCase().charAt(0);

        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
