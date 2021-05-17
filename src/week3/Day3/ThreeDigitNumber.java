package Week3.Day3;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input = scanner.nextInt();
        printThreeDigit(input);

    }
    static void printThreeDigit(int number){
        int c;
        while (number>0){
            c=number%10;
            switch (c){
                case 0:
                    System.out.println(" * * \n  *  *  \n *  *  \n *   * \n");
            }
        }
    }
}
