package Week2.Day5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input b1");
        double b1 = scanner.nextDouble();
        System.out.println("Input q");
        double q = scanner.nextDouble();
        System.out.println("Input nth element");
        double nth = scanner.nextDouble();
        int n = 1;
        while (nth > b1) {
            nth /= q;
            n++;
        }
        System.out.println(n);
    }
}
