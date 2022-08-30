package day2;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Random correctNum = new Random();
        int guess = correctNum.nextInt(20);
        int remainingGuess = 5;
        int temp = 0;
        Scanner input = new Scanner(System.in);
        while (remainingGuess != 0) {
            System.out.println("Guess the number: ");
            temp = input.nextInt();
            if (guess == temp) {
                System.out.println("Congratulations your guess is correct!");
                break;
            } else if (guess < temp) {
                remainingGuess--;
                if (remainingGuess == 0) {
                    System.out.println("You lost!");
                    break;
                }
                System.out.println("Guess lower!");
                System.out.println("Remaining rights to guess: " + remainingGuess);
            } else if (guess > temp) {
                remainingGuess--;
                if (remainingGuess == 0) {
                    System.out.println("You lost!");
                    break;
                }
                System.out.println("Guess higher!");
                System.out.println("Remaining rights to guess: " + remainingGuess);
            }
        }
    }
}
