package Week2.Day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Input n");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        */
        int sum = 0;
        int n = 3;
        int arr[][] = new int[n][n];
        Random random = new Random();
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(3);
            }
        }

        */
        arr[0] = new int[]{0, 1, 2};
        arr[1] = new int[]{1, 5, 3};
        arr[2] = new int[]{2, 3, 4};


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
