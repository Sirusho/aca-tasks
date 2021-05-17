package Week3.Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        System.out.println("length is -> " + returnLength(input));
    }
    public static int returnLength(String string){
        return string.length();
    }
}
