package Week3.Day1;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of students");
        int n = scanner.nextInt();
        int [] grades=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Input grades");
            grades[i]=scanner.nextInt();
        }
        System.out.println("max = "  + maxGrade(grades));
        System.out.println("min = " + minGrade(grades));
        System.out.print("Average = ");
        System.out.println(String.format("%.2f" , avgGrade(grades)));
    }
    public static int maxGrade(int arr[]){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minGrade(int arr[]){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static double avgGrade(int arr[]){
        int avg=0;
        for(int i=0; i<arr.length; i++){
            avg+=arr[i];
        }
        avg/=arr.length;
        return avg;
    }

}
