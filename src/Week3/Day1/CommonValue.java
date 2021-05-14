package Week3.Day1;

import java.util.Scanner;

/*
Write a function  which returns the value (true or false) which is more common among the values ​​of its arguments x, y, z.
static boolean election(boolean x, boolean y, boolean z).
 */
public class CommonValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input 3 booleans");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c=scanner.nextBoolean();
        System.out.println(commonVariable(a,b,c));
    }
    public static boolean commonVariable(boolean x, boolean y, boolean z){
       if(x==y || x==z){
           return x;
       }
       if(y==z){
           return y;
       }else{
           return z;
       }
    }
}
