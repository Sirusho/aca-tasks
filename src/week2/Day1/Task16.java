package week2.Day1;

import java.util.Random;
import java.util.Scanner;

/*
Write a program that generates a random number and asks the user to guess what the number is.
If the user’s guess is higher than the random number,
 the program should display Too high, try again.
 If the user’s guess is lower than the random number,
 the program should display Too low, try again.
 If you find the number print Yes, you guessed the number.
 The program should use a loop that repeats until the user correctly guesses the random number.
 */
public class Task16 {
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        int number = rand.nextInt(upperbound);
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the number");
            int input = scanner.nextInt();
            if(input>number){
                System.out.println("Too high");
            }else if(input<number){
                System.out.println("Too low");
            }else{
                System.out.println("You guessed");
                flag=false;
            }
        }
    }
}