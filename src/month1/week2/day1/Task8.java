package month1.week2.Day1;

import java.util.Scanner;

/*
Input N natural number till N would be the exact power of 2. If N is the exact power of 2 .
 Print N
 Print count of input integers
 break loop
 */
public class Task8 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            int res = 1;
            System.out.println("Input a number");
            int num = scanner.nextInt();
            while (res <= num) {
                if (res == num) {
                    System.out.println("Yes");
                    flag=false;
                    break;
                } else {
                    res *= 2;
                }
            }
            if(res!=num){
                count++;
            }
        }
       System.out.println(count);

    }
}
