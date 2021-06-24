package month1.week2.Day1;

import java.util.Scanner;

/*
The deposit in the bank is x dollars.
 It increases annually by p percent,
  after which the fractional part of cents is discarded.
  Determine how many years the contribution(ներդրում) will be at least y dollars.
  (Input x , p , y from console) Example `
Input `           Output ` 8
100
10
200
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        double x = scanner.nextDouble();
        System.out.println("Input p");
        int p = scanner.nextInt();
        System.out.println("Input y");
        int y = scanner.nextInt();
        int years = 0;
        while (x < y) {
            x += (x * p / 100);
            years++;
        }
        System.out.println(years);
    }
}
