package month1.week2.Day1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        for (int i=num; i>0; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
