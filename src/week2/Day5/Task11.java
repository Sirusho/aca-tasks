package week2.Day5;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        System.out.println("Input m");
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=i+j;
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
