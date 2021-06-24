package month1.week2.Day3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean asc = false;
        boolean desc = false;
        int count = 0;
        int count2 = 0;
        // 1 2 2 3 4 5
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
            } else if (arr[i] <= arr[i + 1]) {
                count2++;
            }
        }
        if (count == n - 1) {
            asc = true;
        }
        if (count2 == n - 1) {
            desc = true;
        }
        if (asc == true) {
            System.out.println("Ascending order");
        } else if (desc == true) {
            System.out.println("Descending order");
        } else {
            System.out.println("Not sorted");
        }
    }
}