package month1.week3.Day3;

import java.util.Scanner;

/*
Write a function which returns
 a character of a given index,
 from a given String.
  Pass as a parameters String str, int index
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        int index = scanner.nextInt();
        System.out.println(returnChar(input, index));

    }
   public static char returnChar(String str, int index){
        return str.charAt(index);
   }
}
