package month1.week1.day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String literal = scanner.nextLine();
        String withNew = new String("input");
        boolean flag;
        flag = literal == withNew;
        System.out.println("== -> " + flag);
        flag = literal.equals("input");
        System.out.println("withNew equals -> " + flag);

    }
}
