package Week3.Day1;

import java.util.Scanner;

public class SmallestOfFour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input 4 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("min = " + min(a, b, c, d));
    }
    public static int min(int a, int b, int c, int d){
        int min=a;
        if(b<min && b<c && b<d){
            min=b;
        }else if(c<min && c<b && c<d){
            min=c;
        }else  if(d<min && d<c && d<b){
            min=d;
        }
        return min;
    }
}
