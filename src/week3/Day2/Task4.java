package Week3.Day2;
/*
Write a method called print(), which takes an array
and print its contents in the form of [a1, a2, ..., an].
 Take note that there is no comma after the last element.
 The method's signature is as follows:
 We need to overload this method for int[ ], float[ ], double[ ] arrays.
 */
public class Task4 {
    public static void main(String[] args) {
        int intArray[]={5, 2, -1, 5};
        double doubleArray[]={4.0, 5.2, 6.8};
        float floatArray[]={4.9f, 5.2f, 3.9f};

        print(intArray);
        print(doubleArray);
        print(floatArray);
    }
    public static void print(int arr[]){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void print(double arr[]){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void print(float arr[]){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
