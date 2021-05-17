package Week1.day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 strings");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        boolean flag;
        flag = first == second;
        System.out.println("== -> " + flag);
        flag = first.equals(second);
        System.out.println("equals -> " + flag);

    }
}
