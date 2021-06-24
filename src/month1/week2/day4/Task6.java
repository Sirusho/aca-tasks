package month1.week2.Day4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Initialization
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(5);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //End of initialization

        int imax = 0;
        int jmax = 0;
        //find maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        int countMax = 0;
        //find count of maximums in array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == max) {

                    countMax++;
                }
            }
        }
        System.out.println("max=" + max);
        System.out.println("max count = " + countMax);
        System.out.println("imax = " + imax + "jmax = " + jmax);
        int maxSum = 0;
        if (countMax > 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == max) {
                        int sumMax = 0;
                        imax = i;
                        int k = 0;
                        while (k < n) {
                            sumMax += arr[imax][k];
                            k++;
                        }
                        if (sumMax > maxSum) {
                            maxSum = sumMax;
                        }
                    }
                }
            }
            System.out.println("max sum is -> " + maxSum);
        } else {
            System.out.println("There is one maximum -> " + max);
        }
    }
}

