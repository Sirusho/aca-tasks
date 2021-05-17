package week2.Day3;

public class Task4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,5,4,-6,0};
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
