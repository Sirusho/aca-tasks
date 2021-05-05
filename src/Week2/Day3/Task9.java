package Week2.Day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr []=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
