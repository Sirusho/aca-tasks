package Week2.Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
