package month1.week3.Day1;

import java.util.Random;
import java.util.Scanner;

/*
 Write a method called copyOf(), which takes an int Array and returns a copy of the given array. The method's signature is as follows:
public static int[] copyOf(int[] array)
 */
public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input array's size");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        Random random=new Random();
        for(int i=0; i<n; i++){
            arr[i]=random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n New array \n");
        printArray(copyOf(arr));

    }
    public static int[] copyOf(int[] array){
        int []newArr=new int[array.length];
        for(int i=0; i<array.length; i++){
            newArr[i]=array[i];
        }
        return newArr;
    }
    public static void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
