package month1.week1.day4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x>0 && y>0){
            System.out.println("In the 1st quarter");
        }else if(x<0 && y>0){
            System.out.println("2nd quarter");
        }else if(x<0 && y<0){
            System.out.println("3rd quarter");
        }else{
            System.out.println("4th quarter");
        }

    }
}
