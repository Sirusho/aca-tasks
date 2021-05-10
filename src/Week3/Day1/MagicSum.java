package Week3.Day1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int res = 0;
        while (flag) {
            System.out.println("Enter a positive integer (or -1 to end):");
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println(res);
                flag = false;
            } else {
                res += magicSum(input);
            }
        }

    }

    public static int magicSum(int n) {
        int sum = 0;
        if (hasEight(n)) {
            sum += n;
        }
        return sum;
    }

    public static boolean hasEight(int number) {
        int n = number % 10;
        while (n > 0) {
            if (n == 8) {
                return true;
            }
            n = number % 10;
            number /= 10;
        }
        return false;
    }
}
