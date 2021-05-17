package Week1.day5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an expression");
        int first = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner.next();
        Scanner scanner2 = new Scanner(System.in);
        int second = scanner.nextInt();
        char operand = input.charAt(0);
        switch (operand) {
            case '+':
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " * " + second + " = " + first * second);
                break;
            case '/':
                System.out.println(first + " / " + second + " = " + first / second);
                break;
            default:
                System.out.println("There is no such operand");
        }

    }
}
