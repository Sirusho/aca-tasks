package Week2.Day3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int imin = 0;
        int imax = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        int temp;
        temp = imin;
        imin = imax;
        imax = temp;
        int temp2;
        temp2 = arr[imin];
        arr[imin] = arr[imax];
        arr[imax] = temp2;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
