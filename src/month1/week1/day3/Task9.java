package month1.week1.day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number in range 32 to 127");
        int number = scanner.nextInt();
        char c = (char) number;
        System.out.println(c);
    }
}
