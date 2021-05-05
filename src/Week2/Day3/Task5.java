package Week2.Day3;

public class Task5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,5,4,-6,0};
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(Math.signum(arr[i])==Math.signum(arr[i-1])){
                System.out.println(arr[i-1] +" " + arr[i]);
                break;
            }
        }
    }
}
