package month1.week1.day4;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You're allowed to vote");
        } else {
            System.out.println("You're not allowed to vote");
        }
    }
}
