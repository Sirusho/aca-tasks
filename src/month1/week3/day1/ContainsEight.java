package month1.week3.Day1;

import java.util.Scanner;

public class ContainsEight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
    }
    public static boolean hasEight(int number){
        int n=number%10;
        while (n>0){
            if (n==8){
                return true;
            }
            n=number%10;
            number/=10;
        }
        return false;
    }
}
