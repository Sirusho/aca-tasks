package month1.week1.day5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Quiz score");
        int quizScore = scanner.nextInt();
        System.out.println("Enter Mid score");
        int midScore = scanner.nextInt();
        System.out.println("Enter Final Score");
        int finalScore = scanner.nextInt();

        int avg = (quizScore + midScore + finalScore) / 3;
        System.out.println("Your average is + " + avg);
        switch (avg / 20) {
            case 2:
                System.out.println("Your grade is C");
                break;
            case 3:
                System.out.println("Your grade is B");
                break;
            case 4:
            case 5:
                System.out.println("Your grade is A");
                break;
            default:
                System.out.println("You failed");
        }
    }
}
