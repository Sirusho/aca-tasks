package Week2.Day3;

import java.util.Scanner;
/*
Cycle the elements of the array to the right (A [0] goes to A [1], A [1] to A [2], ..., the last element goes to A [0]).
Example ` Input `   1 2 3 4 5
                 Output ` 5 1 2 3 4
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr []=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        // 1 2 3 4 5
        // 5 1 2 3 4
        int temp;
        temp=arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
