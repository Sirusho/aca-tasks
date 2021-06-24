package month1.week2.Day5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        System.out.println("Input m");
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0; i<n; i++) {
            if (i % 2 == 0) {
                for (int j = n * i; j < n * i + n; j++) {
                    System.out.print(j);;
                }
                System.out.println();
            } else {
                for (int j = n * i + n-1 ; j >= n * i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
