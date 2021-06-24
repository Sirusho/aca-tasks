package month1.week4.day1.arithmetic;

import java.util.Scanner;

/*
.ARITHMETIC
Define Arithmetic.java class which
has a field int[ ] array
define constructor
your class must have options like`
  options()
  bubbleSort()
 // quickSort()
  binarySearch()
  min()
  max()
  average()
  checkArithmeticProgression()
options() method must give an option to choose what kind of acton user wants like this `                     “Binary Search -- 1”
       “QuickSort -- 2” etc...
but if he wants binarySearch() before choosing sort() actions, your program must sort() at first then search the element,
like binarySearch() also for min() and max()
also you must have an option to find arithmetic progression and print about it, else print that your array doesn’t have arithmetic progression
also use System.currentTimeMillis() method to check how much time works your algorithm()

 */
public class Arithmetic {
    int arr[];

    public Arithmetic(int[] arr) {
        this.arr = arr;
    }

    void bubbleSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
    }

    void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);
    }

    void average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("average = " + sum / arr.length);
    }

    int binarySearch(int[] arr, int number) {
        bubbleSort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
                System.out.println("The number is present at position " + mid);
                return mid;
            }
            if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("The number is not present in the array");
        return -1;
    }

    void checkArithmeticProgression(int arr[]) {
        int dif = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != dif) {
                System.out.println("There is not arithmetic progression in the array");
            }
        }
        System.out.println("Arithmetic progression");
    }

    void options() {
        System.out.println("Bubble sort -- 1 \n" +
                "Min -- 2 \n" + "Max -- 3 \n" + "Average -- 4 \n" + "Arithmetic Progression -- 5 \n" +
                "Binary Search -- 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n ---Choose an option--- \n");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                bubbleSort(arr);
                break;
            case "2":
                min(arr);
                break;
            case "3":
                max(arr);
                break;
            case "4":
                average(arr);
                break;
            case "5":
                checkArithmeticProgression(arr);
                break;
            case "6":
                System.out.println("Input a number to find in an array");
                int num = scanner.nextInt();
                binarySearch(arr, num);
        }
    }
}
