package Week1.day2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b=scanner.nextInt();
        System.out.println("The remainder is -> " + a%b);
    }
}
