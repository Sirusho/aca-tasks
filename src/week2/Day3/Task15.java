package week2.Day3;

import java.util.Scanner;

/*
A list is given. Print those elements of it that appear in the list only once. Items should be displayed in the order in which they appear in the list.
Example` Input ` 1 2 2 3 3 3
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            int j = 0;
            while (j < n) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    } else {
                        j++;
                        count++;
                    }
                } else {
                    j++;
                }
            }
            if (count == n - 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
