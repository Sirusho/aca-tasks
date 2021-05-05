package Week2.Day3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        int imax=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                imax=i;
            }
        }
        System.out.println("max = " + max + " imax = "  + imax);
    }
}
