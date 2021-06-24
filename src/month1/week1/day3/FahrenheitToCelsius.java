package month1.week1.day3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input degree in Fahrenheit ");
        int fahrenheit = scanner.nextInt();
        double fahrenheitDegree = -17.2222222;
        double result = fahrenheit * fahrenheitDegree;
        System.out.println(result + " Celsius");
        float floatFahrenheit = (float) result;
        System.out.println("float -> " + floatFahrenheit + " Celsius");
        int intFahrenheit = (int) result;
        System.out.println("int -> " + intFahrenheit + " Celsius");

    }
}
