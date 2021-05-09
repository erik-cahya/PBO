import java.util.Scanner;

public class Hangman extends Main {
    public void mainScene() {
        Scanner input = new Scanner(System.in);
        // Choosing random word randomly
        String word = dictionary[(int) (Math.random() * dictionary.length)];
        // Start guessing game with chosen word and count missed times
        int missed = startGuessing(word, input);
        // Display result
        System.out.println("\n > The word is '" + word + (missed == 0 ? "' you are correct"
                : "' you missed " + (missed == 1 ? "' one time" : " " + missed + " times")));
        // Ask for another game
        askForAnotherGame(input);
    }

    // List of dictionary [Array]
    private String[] dictionary = { "programming", "fish", "cairo", "arabs", "quraan", "sunnah", "editor",
            "photography", "artist", "software", "write", "read", "gaming", "lunch", "participate", "lunch", "dinner",
            "house", "books", "animals" };

    // User start guessing the word
    private int startGuessing(String originalWord, Scanner input) {
        StringBuilder replacedWord = new StringBuilder(hideRealWord(originalWord));
        int missing = 0;
        boolean wrongGuessing;
        int wordLength = originalWord.length();
        while (wordLength > 0) {
            System.out.print("\n > Enter a letter in word " + replacedWord.toString() + " ");
            char character = input.nextLine().charAt(0);// Get char at String index[0] on user Input
            wrongGuessing = true;
            for (int j = 0; j < originalWord.length(); j++) {
                if (originalWord.charAt(j) == character) {
                    replacedWord.setCharAt(j, character); // Change char that contain user input
                    wrongGuessing = false; // Set the wrong guessing to false if there is a word contain the word
                    wordLength--; // Decrease amount of character that missing
                    drawHangman(missing); // Then draw the hangman
                }
                if (character == replacedWord.charAt(j))
                    System.out.println("\n >" + character + " Already in the word");
            }
            if (wrongGuessing) {
                missing++; // Increase amount of missing guess
                System.out.println("\n > '" + character + "' is not in the word");
                drawHangman(missing);
            }
        }
        return missing;
    }

    // Hide the original word that we got from dictionary
    private String hideRealWord(String originalWord) {
        System.out.println(" Word Cheat : " + originalWord); // This just a cheat to make it easier to explain
        for (int i = 0; i < originalWord.length(); i++) {
            char ASTERISK = '_';
            originalWord = originalWord.replace(originalWord.charAt(i), ASTERISK);// Replace original word with ASTERiSK
        }
        return originalWord;
    }

    private void drawHangman(int l) {
        Scanner input = new Scanner(System.in);
        if (l == 0) {
            System.out.println("|----------\n|\n|\n|\n|\n|\n|");
        } else if (l == 1) {
            System.out.println("|----------\n|    O\n|\n|\n|\n|");
        } else if (l == 2) {
            System.out.println("|----------\n|    O\n|    |\n|\n|\n|\n|");
        } else if (l == 3) {
            System.out.println("|----------\n|    O\n|   -|\n|\n|\n|\n|");
        } else if (l == 4) {
            System.out.println("|----------\n|    O\n|   -|-\n|\n|\n|\n|");
        } else if (l == 5) {
            System.out.println("|----------\n|    O\n|   -|-\n|   /\n|\n|\n|");
        } else {
            System.out.println("|----------\n|    O\n|   -|-\n|   /|\n|\n|\n|");
            askForAnotherGame(input);
        }
    }

    private void askForAnotherGame(Scanner input) {
        System.out.print("\n > Do you want to start another word? Enter y or n");
        char gameCase = input.nextLine().charAt(0);
        if (gameCase == 'y')
            mainScene();
        else
            System.exit(1);
    }
}