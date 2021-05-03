package Week2.Day1;

import java.util.Scanner;

/*
On the first day, the athlete ran x kilometers,
and then every day he increased the mileage by 10% from the previous value,
Given the number y, determine the number of the day for which the athlete's mileage will be at least y kilometers.
Example` Input 10     Output 9
                         20
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int days = 0;
        float sum = x;
        float dist = x;
        while (sum <= y) {
            dist += dist * 10 / 100;
            sum += dist;
            days++;
        }
        System.out.println(days);

    }
}
