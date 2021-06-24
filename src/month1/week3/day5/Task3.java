package month1.week3.Day5;

import java.util.Scanner;

/*
3.Write a java program which will sort a given array of Strings.(using bubble sort)
pass natural number N to your function
declare and initialize array of Strings with size N
sort array
print array
for sorting and printing use separate function
hints` use  str.compareTo() method
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        String [] arr=new String[n];
        for(int i=0; i<=n; i++){
            arr[i]=scanner.nextLine();
        }
        printArray(sortArray(arr));

    }
    static String [] sortArray(String [] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }



}
