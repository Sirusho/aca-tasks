package Week2.Day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int res;
        for (int i = 1; i <= num; i++) {
            res = i * i;
            if (res <= num) {
                System.out.println(res);
            }
        }
    }
}
