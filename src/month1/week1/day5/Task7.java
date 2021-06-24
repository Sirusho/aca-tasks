package month1.week1.day5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        String result = input.isBlank() ? "-1"
                : input.equals(" ") ? "0" : "1";
        System.out.println(result
        );

    }
}
