package Week3.Day5;
import java.util.Random;
import java.util.Scanner;
/*
2.Write a java program using recursion which
have a function which get as a input natural N,
declare and initialize array which  size is N
generate random integers between 1 to 100 and fill your array
sort array using bubble sort algorithm
print sorted array
for sorting and printing use separate methods
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        bubbleSort(initializeArray(n), n);
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

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
