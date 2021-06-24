package month1.week3.Day5;

import java.util.Random;
import java.util.Scanner;

/*
9.Write a function that receives as a parameter array, int
sort array
find index for a given int parameter using binary search
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        System.out.println("input number");
        int input=scanner.nextInt();
        int[] array= initializeArray(n);
        System.out.println(findIndex(array, input));
    }

    static int[] initializeArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n \n Sorted array \n ");
        return arr;
    }

    static void bubbleSort(int arr[], int n) {
        if (n == 1) {
            printArray(arr);
            return;
        }
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        bubbleSort(arr, n - 1);

    }
    static int findIndex(int arr[], int number){
        bubbleSort(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                System.out.println("index found ");
                return i;
            }
        }
        return -1;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}
