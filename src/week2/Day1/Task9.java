package week2.Day1;

import java.util.Scanner;
/*For a given natural N print the smallest integer k that`
 Math.pow(2,k)≥N.(You can not use Math.pow())
Example` Input 7
         Output 3

 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        int res=1;
        int count=0;
        while(res<=num){
            res*=2;
            count++;
        }
        System.out.println("2 ^ " + count +" " + Math.pow(2,count));

    }
}
