import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read user input
public class Main {
    public static void main(String[] args) {

    // Intialization of the Scanner class to read user input from the console. 
    // The program prompts the user to enter their total stat points and their class, then it displays the entered information back to the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total stat points: ");
        int totalStats = scanner.nextInt();
        System.out.println("You have " + totalStats + " stat points.");
        System.out.print("What class are you? (Hero, Bandit, Astrologer, Warrior, Prisoner, Confessor, Wretch or Vagabond):");
        String playerClass = scanner.next();
        System.out.println("You are a " + playerClass + ".");

        // Generating random stats for the player based on their total stat points and class. The program uses a switch statement to assign different stat distributions based on the player's chosen class.
        Random randStat = new Random();

        int[] stats = new int[8]; // Assuming there are 8 stats to distribute
        
        for (int i = 0; i < totalStats; i++){ // Loop through the total stat points and randomly distribute them among the stats 
            stats[randStat.nextInt(stats.length)]++; // Randomly distribute stat points
        }
        System.out.println("Your stats are:");
        System.out.println("Vigor: " + stats[0]);
        System.out.println("Mind: " + stats[1]);
        System.out.println("Endurance: " + stats[2]);
        System.out.println("Strength: " + stats[3]);
        System.out.println("Dexterity: " + stats[4]);
        System.out.println("Intelligence: " + stats[5]);
        System.out.println("Faith: " + stats[6]);
        System.out.println("Arcane: " + stats[7]);

        // Action Phase 
        // Writing conditions to account for the player's class and stats, and then determining the outcome of an action based on those conditions. The program uses if-else statements to check the player's class and stats, and then it prints out the result of the action.
        


    }
}
