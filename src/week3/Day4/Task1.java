package Week3.Day4;
/*
Write a recursive function
to find the sum of a given array.
to find the factorial of a given natural N.

 */

// 15 16 17
public class Task1 {
    public static void main(String[] args) {

    }
    static int  sumOfArray(int [] arr, int step){
        if(step==0){
            return arr[step];
        }
        return arr[step]+sumOfArray(arr, step-1);
    }
    static int factorial(int k){
        if(k==1){
            return 1;
        }
        return k*factorial(k-1);
    }
}
