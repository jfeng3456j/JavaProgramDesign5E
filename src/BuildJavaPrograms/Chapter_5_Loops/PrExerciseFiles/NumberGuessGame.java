package BuildJavaPrograms.Chapter_5_Loops.PrExerciseFiles;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main (String[] args)
    {
        String pr_description = "Let’s consider an example game\n" +
                "with the following rules. The computer thinks of a random two-digit number but keeps\n" +
                "it secret from the player. We’ll allow the program to accept positive numbers only, so\n" +
                "the acceptable range of numbers is 00 through 99 inclusive. The player will try to guess\n" +
                "the number the computer picked. If the player guesses correctly, the program will\n" +
                "report the number of guesses that the player made.\n" +
                "To make the game more interesting, the computer will give the player a hint each\n" +
                "time the user enters an incorrect guess. Specifically, the computer will tell the player\n" +
                "how many digits from the guess are contained in the correct answer";

        System.out.println("Problem description: " + pr_description);

        introduction();
        Scanner scanner = new Scanner(System.in);

        numGuess(scanner);
    }

    public static void introduction()
    {
        System.out.println("Try to guess my 2 digits number, and I'll tell how many digits from your guess appear in my number.");
        System.out.println();
    }

    public static void numGuess(Scanner scanner)
    {
        //pick a random number from 0 to 99 inclusive
        int computerGuess = new Random().nextInt(100);

        //player guess
        System.out.println("Enter a num from 0 - 99: ");
        int playerGuess = scanner.nextInt();
        int numGuesses = 1;

        System.out.println("what is computerGuess: " + computerGuess);

        // give hints until correct guess is reached
        while (playerGuess != computerGuess)
        {
            int numberMatches = matches (computerGuess, playerGuess);
            System.out.println("Incorrect (hint: " + numberMatches + " digits matches");

            System.out.println("Try again, guess a number: ");

            playerGuess = scanner.nextInt();

            numGuesses++;
        }

        System.out.println("You got it right "  + numGuesses + " tries.");
    }

    // compare digits by digits
    public static int matches(int computerGuess, int playerGuess)
    {
        // compare computerGuess with playerGuess 10th place, one place
        // i.e computerGuess = 45, playerGuess = 25
        // 4 == 2 or 4 == 5
        int numMatches = 0;

        // check computerGuess 10th places with playgerGuess
        if (computerGuess / 10 == playerGuess / 10 || computerGuess / 10 == playerGuess % 10)
        {
            numMatches++;
        }

        // check computerGuess one places with playgerGuess
        if (computerGuess % 10 == playerGuess / 10 || computerGuess % 10 == playerGuess % 10)
        {
            numMatches++;
        }

        return numMatches;
    }
}
