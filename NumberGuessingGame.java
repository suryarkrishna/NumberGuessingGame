package NumberGuessingGame;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1);

        int maxAttempts = 5;
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("I've picked a number between "+ minRange +" and "+maxRange +". Can you guess it?");

        while(attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if(guess == randomNumber) {
                hasGuessed = true;
                break;
            }else if(guess < randomNumber) {
                System.out.println("Your guess is low");
            }else {
                System.out.println("Your guess is high");
            }

            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Remaining attempts: "+remainingAttempts);
        }

        if(hasGuessed){
            System.out.println("Congratulations! You've have guess the number "+randomNumber+" correctly.");
        }else {
            System.out.println("Sorry, you've run out of attempts. The correct number was "+randomNumber+ " .");
        }
        scanner.close();
    }

}