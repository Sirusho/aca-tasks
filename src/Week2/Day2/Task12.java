package Week2.Day2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j >= 1) {
                if (count < n) {
                    System.out.print(i + " ");
                    j--;
                    count++;
                } else {
                    break;
                }
            }

        }
    }
}
