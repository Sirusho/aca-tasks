package month1.week2.Day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input minutes");
        int input = scanner.nextInt();
        int hours;
        int minutes = 0;
        hours = input / 60;
        minutes = input % 60;
        if (hours > 23) {
            hours = hours % 24;
        }
        System.out.println(hours + " hours " + minutes + " minutes");


    }
}
