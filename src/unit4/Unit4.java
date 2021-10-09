package unit4;

import java.util.Scanner;

public class Unit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGuesses = 0;
        int numCorrect = 0;

        while (true) {
            System.out.println("Choose a number between 1-5.");
            int chosen = scanner.nextInt();
            if (chosen < 1 || chosen > 5) {
                System.out.println("Invalid number");
                continue;
            }
            int actual = ((int) (Math.random() * 5)) + 1;
            if (chosen == actual) {
                System.out.format("You guessed the right number %d!\n", chosen);
                numCorrect++;
            } else {
                System.out.format("You guessed %d but the number was %d.\n", chosen, actual);
            }
            numGuesses++;
            double winRate = ((double) numCorrect) / numGuesses * 100;
            System.out.format("Current score: %d / %d = %f\n", numCorrect, numGuesses, winRate);
        }
    }
}
