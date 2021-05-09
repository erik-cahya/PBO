import java.util.Random;
import java.util.Scanner;

public class DungeonGame extends Main {
    public void mainScene() {
        try (Scanner input = new Scanner(System.in)) {
            // System Variables
            Random random = new Random();
            // Enemies Variables
            // Final to declare a constant variable
            final String[] enemies = { "Zombie", "Skeleton", "Giant Spider", "Witch" };
            int maxEnemyHealth = 100, enemyAttackDmg = 25;
            // Player Variables
            int health = 150, attackDmg = 50, healPotionAmount = 30;
            float healPotionDropChance = 50 /* percentage */;
            short numHealthPotion = 3;
            boolean running = true;
            System.out.println(" Welcome to the Dungeon Game ");
            // Labeled break statement terminates the outer most loop where as the normal
            // break statement terminates the innermost loop
            GAME: while (running) {
                System.out.println("==============================================================================");
                int enemyHealth = random.nextInt(maxEnemyHealth);
                String enemy = enemies[random.nextInt(enemies.length)];
                System.out.println("\t # " + enemy + " has appeared! #");
                while (enemyHealth > 0) {
                    System.out
                            .println("==============================================================================");
                    System.out.println("\t Your HP : " + health);
                    System.out.println("\t " + enemy + "'s health : " + enemyHealth);
                    System.out.println("\n\t What would you like to do?\n\t[1] Attack\n\t[2] Health Potion\n\t[3] Run");
                    System.out.print("\n> Tell me your action : ");
                    String action = input.nextLine();
                    System.out.println("\n");
                    if (action.equals("1")) { // User Attack
                        int dmgDealt = random.nextInt(attackDmg);
                        int dmgTaken = random.nextInt(enemyAttackDmg);
                        enemyHealth -= dmgDealt; // Damage taken by user damage
                        health -= dmgTaken; // Damage taken by enemy damage
                        System.out.println("\n\t You strike the " + enemy + " for " + dmgDealt + " damage.");
                        System.out.println("\t You receive " + dmgTaken + " in retaliation.");
                        if (health < 1) {
                            System.out.println("\t You have taken to much damage, too weak to continue this battle");
                            break;
                        }
                    } else if (action.equals("2")) { // Using Health Potion
                        if (numHealthPotion > 0) { // Check if there is health potion available
                            health += healPotionAmount; // When user using health potion user health increase
                            numHealthPotion--; // But it will decrease the amount of Health Postion
                            System.out.println("\t> You just drank a health potion, healed for " + healPotionAmount
                                    + "\n\t > You now have : " + health + "HP." + "\n\t > You now have : "
                                    + numHealthPotion + " health potion left \n");
                        } else {
                            System.out.println(
                                    "\t> There is no health potion left, defeat enemies for chance to get one");
                        }
                    } else if (action.equals("3")) { // User Run from the battle field
                        System.out.println("\t> You run from the " + enemy);
                        continue GAME; // It will repeat the Game Label and Start with new enemy;
                    } else {
                        System.out.println("--------------------- \n \t> Invalid Command \n ---------------------");
                    }
                }
                if (health < 1) { // Check if user health still can be able to fight
                    System.out.println("===========================================================================");
                    System.out.println("> You limp out of the dungeon, too weak for a battle");
                    break;
                }
                System.out.println("=========================================================================== \n # "
                        + enemy + " was defeated! # \n # You have " + health + " HP left #");
                if (random.nextInt(100) < healPotionDropChance) {
                    numHealthPotion++;
                    // Num health will increase if the random number less than 50 (if defeated)
                    System.out.println("===========================================================================");
                    System.out.println(" # " + enemy + " dropped a health potion. #\n # You now have " + numHealthPotion
                            + "health potion(s)");
                }
                // After finish battle
                System.out.println("===========================================================================");
                System.out.println(" What would you like to do now ?\n [1] Continue fighting\n [2] Leave the dungeon");
                System.out.print("\n> What is your choice : ");
                String option = input.nextLine();
                while (!option.equals("1") && !option.equals("2")) {
                    System.out.println(" > Invalid command ");
                    option = input.nextLine();
                }
                if (option.equals("1")) {
                    System.out.println("> You continue your adventure.\n\n");
                    continue GAME;
                } else if (option.equals("2")) {
                    System.out.println("\n> You exit the dungeon.\n");
                    break;
                }
            }
            System.out.println("\t ** Thank you for playing **");
        }
    }
}