package Week2.Day3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += Math.abs(arr[i]);
        }
        int min = Integer.MAX_VALUE;
        if (sum <= 1000) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0 && arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("min = " + min);
        } else {
            System.out.println("Absolute value exceeds 1000");
        }
    }
}
