package month1.week3.Day5;

import java.util.Random;
import java.util.Scanner;

/*
6.Write a java program which
will sort a given array using selection sort
will find and print min and max values
will find the average of sorted array
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        int array[] = initializeArray(n);
        System.out.println("print Array");
        printArray(array);
        System.out.println("selection sort");
        printArray(selectionSort(array));
        System.out.println("find avergae");
        System.out.println(findAverage(array));

    }

    static int[] initializeArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static int[] selectionSort(int array[]) {
        for (int j = 0; j < array.length - 1; j++) {
            int imin = j;
            for (int i = j+1; i < array.length; i++) {
                if (array[i] < array[imin]) {
                    imin = i;
                }
                if (imin != j) {
                    int temp = array[j];
                    array[j] = array[imin];
                    array[imin] = temp;
                }
            }
        }
        return array;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findAverage(int arr[]) {
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        System.out.println("average is -> ");
        return average/arr.length;

    }

}
