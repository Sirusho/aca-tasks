package month1.week2.Day3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int temp=0;
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == temp) {
                count++;
            }
                temp++;
            }
        System.out.println(count);

    }
    }
