package Week2.Day1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();

        for(int i=0; i<=num; i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
