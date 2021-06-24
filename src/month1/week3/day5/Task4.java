package month1.week3.Day5;

import java.util.Scanner;

/*
4.Write the same 3 th exercise using recursion.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        sort(arr, n);
    }

    static void sort(String arr[], int n) {
        if (n == 1) {
            printArray(arr);
            return;
        }
        for (int i = 0; i < n - 1; i++)
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                String temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        sort(arr, n - 1);

    }

    static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
