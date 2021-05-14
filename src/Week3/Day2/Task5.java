package Week3.Day2;
/*
Write a search function, which
get as an argument int[ ] array, (returns the size of array)
public static int search(int[ ] array)
get as an argument int[ ] array , also int a, and returns an index of that argument
public static int search(int[ ] array, int a)
get as an argument int[ ] array, int argument, int index
returns true if that element is in that place in array,otherwise false
public static boolean search(int[] array, int argument, int index)
 */
public class Task5 {
    public static void main(String[] args) {
        int arr[]={5, 4, 2, 0, -9, 6};
        System.out.println(search(arr));
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 5, 4));
    }
    public static int search(int [] array){
        return array.length;
    }
    public static int search(int [] array, int a){
        int index=0;
        for(int i=0; i< array.length; i++){
            if(a==array[i]){
                index=i;
               break;
            }
        }
        return index;
    }
    public static boolean search(int [] array, int a, int index){
        boolean flag=false;
        for(int i=0; i<array.length; i++){
            if(array[i]==a && index==i){
                flag=true;
            }
        }
        return flag;
    }
}
