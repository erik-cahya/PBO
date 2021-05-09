import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            DungeonGame dungeonGame = new DungeonGame();
            Hangman hangmanGame = new Hangman();
            System.out.println("==============================================================================");
            System.out.println("\t Hi, Welcome to Game Mode ");
            System.out.println(" Choose what game make you interested in ");
            System.out.println("==============================================================================");
            System.out.println(" [1] Dungeon Battle Game");
            System.out.println(" [2] Hangman Word Game");
            System.out.println("==============================================================================");
            System.out.print("Please input the secret code here : ");
            int game = input.nextInt();
            switch (game) {
            case 1:
                dungeonGame.mainScene();
                break;
            case 2:
                hangmanGame.mainScene();
                break;
            default:
                System.out.println("==============================================================================");
                System.out.println("Invalid Command");
                System.out.println("==============================================================================");
                break;
            }
        }
    }
}