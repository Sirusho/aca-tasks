package month1.week3.Day5;

import java.util.Random;
import java.util.Scanner;

/*
1.Write a java program which
have a function which get as a input natural N,
declare and initialize array which  size is N
generate random integers between 1 to 100 and fill your array
sort array using bubble sort algorithm
print sorted array
for sorting and printing use separate methods
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        int arr[] = initializeArray(n);
        int arr2[] = arr.clone();
        Long start = System.currentTimeMillis();
        System.out.println("\n start = " + start);
        printArray(bubbleSort(arr));
        Long end = System.currentTimeMillis();
        System.out.println("\n end =" + end);
        printArray(bubbleSort2(arr2));
        System.out.println("\n difference = " + (end - start));

    }

    static int[] initializeArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(1000);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n \n Sorted array \n ");
        return arr;
    }

    static int[] bubbleSort(int array[]) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                sum++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("sum 1 = " + sum);
        return array;
    }

    static int[] bubbleSort2(int array[]) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                sum++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("sum 2= " + sum);
        return array;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
