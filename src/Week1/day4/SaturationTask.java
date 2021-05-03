package day4;

import java.util.Scanner;

public class SaturationTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your saturation level (0/30/50/70/90/100)");
        int saturation = scanner.nextInt();

        if (saturation == 0) {
            System.out.println("You are dead!!");
        } else if (saturation == 30) {
            System.out.println("Almost dead");
        } else if (saturation == 50) {
            System.out.println("Ill");
        } else if (saturation == 70) {
            System.out.println("Good case");
        } else if (saturation == 90) {
            System.out.println("Healthy");
        } else if (saturation == 100) {
            System.out.println("Excellent");
        } else {
            System.out.println("There is no such case");
        }
    }
}
