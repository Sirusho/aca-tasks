package month1.week1.day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("         Menu         ");
        System.out.println("Press 1 for perimeter");
        System.out.println("Press 2 for area");
        int input = scanner.nextInt();
        int radius = 4;
        if (input == 1) {
            System.out.println("Perimeter is -> " + 2 * Math.PI * radius);
        } else if (input == 2) {
            System.out.println("Area is -> " + Math.PI * Math.pow(radius, 2));
        } else {
            System.out.println("Your input was not correct");
        }
    }
}
