package BuildJavaPrograms.Chapter_7_Arrays.ProgramProjects;

import java.util.Scanner;

public class HangManGame {

    public static final int ALPHA_LENGTH = 26;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = args[0].toLowerCase();

        if (!isValidWord(word)) {
            System.out.println("Not a valid word");
            System.out.println("Words can only contain letters");
            System.out.println("Exiting the program");
            return;
        }

        //play the hang game
        playHangMan(word, input);

        System.out.printf("you guessed the word %s. Well done!", word);
    }


    private static void playHangMan(String word, Scanner input) {

        int[] guesses = new int[ALPHA_LENGTH];

        while(true) {
            System.out.println("Word: " + getWordWithGuesses(word, guesses));
            System.out.println("Guesses: " + getAlreadyGuessed(guesses));

            char guess = getLetter(input);

            if (alreadyGuessed(guess, guesses)) {
                System.out.println("Already Guessed");
                continue;
            }

            guesses[guess - 'a']++;

            if (finishedHangman(word, guesses)) {
                break;
            }

        }
    }

    public static boolean finishedHangman(String word, int[] guesses) {
        for (int i = 0; i < word.length(); i++) {
            if (guesses[word.charAt(i) - 'a'] == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean alreadyGuessed(char guess, int[] guesses) {
        if (guesses[guess - 'a'] == 1) return true;
        return false;
    }

    private static char getLetter(Scanner input) {
        System.out.print("Next Guess: ");
        String result = input.next();

        while (!isValidCharacter(result)) {
            System.out.print("Please enter a valid character (a-z)(A-Z): ");
            result = input.next();
        }

        return Character.toLowerCase(result.charAt(0));

    }

    private static boolean isValidCharacter(String result) {
        if (result == null || result.length() < 1) return false;

        char c = result.charAt(0);

        if (c < 'a' || c > 'z') return false;

        return true;
    }

    private static String getWordWithGuesses(String word, int[] guesses) {
        String result = "";

        //display letters that have been guessed
        for(int i = 0; i < word.length(); i++) {
            if (guesses[word.charAt(i) - 'a'] > 0) {
                result += word.charAt(i);
            } else {
                result +="_";
            }
        }

        return result;
    }

    private static String getAlreadyGuessed(int[] guesses) {
        String result = "";

        for(int i = 0; i < guesses.length; i++) {
            if (guesses[i] > 0) result += (char)(i+ 'a');
        }

        return result;
    }


    private static boolean isValidWord(String word) {
        if (word == null || word.length() < 1) return false;

        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 'a' || word.charAt(i) > 'z') return false;
        }

        return true;
    }


}
