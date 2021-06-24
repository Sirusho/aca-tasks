package month1.week1.day2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 999");
        int number = scanner.nextInt();
        System.out.println("The sum of digits is -> " + ((number/100)+(number/10)%10+number%10));
    }
}
