package month1.week2.Day1;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum+=num%10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
