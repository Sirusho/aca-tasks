package Week3.Day1;

import java.util.Scanner;

/*
Write a method called search(), which takes an array of int and an int;
and returns the array index if the array contains the given int;
 or -1 otherwise. The method's signature is as follows:
public static int search(int[] array, int key);
Also write a test driver to test this method
 */
public class Task13 {
    public static void main(String[] args) {
        int arr[]={1, 3, 6, -5, 0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        System.out.println(search(arr, num));

    }
    public static int search(int[] array, int key){
        int imax=0;
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                imax=i;
                return imax;
            }
        }
        return -1;
    }
}
