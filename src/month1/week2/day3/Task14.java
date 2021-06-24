package month1.week2.Day3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean flag = true;
        System.out.println("input k");
        int k = scanner.nextInt();
//        if (k >= n) {
//            System.out.println("Invalid input");
//            flag = false;
//        }
//        if (flag) {
            int temp;
           for(int i=0; i<n; i++) {
               if (i == k) {
                   while (k < n-1) {
                       arr[k] = arr[k + 1];
                       k++;
                   }
               }
           }
            for (int i = 0; i < n-1; i++) {
                System.out.println(arr[i]);
            }
        }
    }
