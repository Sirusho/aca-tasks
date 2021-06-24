package month1.week3.Day5;

import java.util.Scanner;

/*
7.Write a java program which
will sort a given array of Strings
will print min and max values

 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        String [] arr=new String[n+1];
        for(int i=0; i<=n; i++){
            arr[i]=scanner.nextLine();
        }
        printArray(sortArray(arr));
        System.out.println(" ");
        System.out.println(" min is " + printMin(arr));
        System.out.println(" max is " + printMax(arr));

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
    static String printMin(String [] arr){
         sortArray(arr);
        return arr[1];
    }
    static String printMax(String [] arr){
        sortArray(arr);
        return arr[arr.length-1];
    }

    static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }





}
