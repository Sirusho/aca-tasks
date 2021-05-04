package Week2.Day2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        int n = scanner.nextInt();
            for (int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
    }
}
