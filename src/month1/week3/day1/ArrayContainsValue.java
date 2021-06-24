package month1.week3.Day1;

import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int arr[]={3,2,0,-5,4,2};
        System.out.println(contains(arr, num));

    }

    public static boolean contains(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
