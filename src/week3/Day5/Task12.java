package Week3.Day5;
/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
Example
For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */
public class Task12 {
    public static void main(String[] args) {
        int arr[]=new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        printArray(sortByHeight(arr));
    }
        static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        }
    static int[] sortByHeight(int[] a) {
        if(a==null||a.length==0||a.length==1) return a;
        int l=0;
        int r=a.length-1;
        while(l<=r){
            if(a[l]==-1){
                l++;
            }else if(a[r]==-1) {
                r--;
            }else{
                insertionSort(a,l,r);
                l++;
            }
        }
        return a;
    }
   static void insertionSort(int [] a, int l,int r){
        for(int ind=r;ind>=l; ind--){
            if(a[ind]!=-1 && a[ind]<a[l]){
                swap(a, ind, l);
            }
        }
    }
    static void swap(int[] a, int p1, int p2){
        int temp=a[p1];
        a[p1]=a[p2];
        a[p2]=temp;
    }

}
