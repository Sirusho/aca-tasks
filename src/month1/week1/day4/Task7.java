package month1.week1.day4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7");
        int weekDay = scanner.nextInt();
        if (weekDay == 1) {
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Tuesday");
        } else if (weekDay == 3) {
            System.out.println("Wednesday");
        } else if (weekDay == 4) {
            System.out.println("Thursday");
        } else if (weekDay == 5) {
            System.out.println("Friday");
        } else if (weekDay == 6) {
            System.out.println("Saturday");
        } else if (weekDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("there is no day like your input in a week");
        }


    }
}
