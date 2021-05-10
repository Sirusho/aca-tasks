package Week3.Day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 booleans");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        System.out.println(xor(a, b));
    }

    public static boolean xor(boolean a, boolean b) {
        if (a && b) {
            return false;
        }
        return true;
    }
}
