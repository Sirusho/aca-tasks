package Week2.Day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int res=1;
        while (res<=num){
            System.out.println(res);
            res*=2;
        }
    }
}
