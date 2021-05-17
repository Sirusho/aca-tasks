package Week1.day3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius");
        double radius = scanner.nextDouble();
        double Pi = 3.14159;
        System.out.println("Area is -> " + Pi * radius * radius);
        System.out.println("Perimeter is -> " + 2 * Pi * radius);

    }
}
