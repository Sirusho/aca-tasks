package Week2.Day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr []=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int temp;
        for(int i=1; i<n; i+=2){
            temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
