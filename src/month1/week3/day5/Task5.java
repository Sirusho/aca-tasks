package month1.week3.Day5;

import java.util.Random;
import java.util.Scanner;

/*
Write a  java program which
will sort a given array
find and print max and min values
find the element in the array that is relevant to average from min and max,
 if array does not contain such element print -1.
for searching use bubble sort, write separate functions for sorting, printing, and to find if there are avg element
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        int array[] = initializeArray(n);
        printArray(array);
        System.out.println(findAverage(array));

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

    static int[] bubbleSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
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
        System.out.println("Average is -> " + (findMax(arr) + findMin(arr)) / 2);
        int average = (findMax(arr) + findMin(arr)) / 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == average) {
                System.out.println(" ");
                return arr[i];
            }
        }
        System.out.println(" ");
        return -1;

    }

}
