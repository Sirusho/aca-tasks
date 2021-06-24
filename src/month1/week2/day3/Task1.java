package month1.week2.Day3;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
          arr[i]=scanner.nextInt();
        }
        for(int i=0; i<arr.length; i+=2){
            System.out.println(arr[i]);
        }
    }
}
