package Test;
import java.util.Scanner;

public class RollerCoasterRide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in cm (between 122 and 188 cm): ");
        int height = input.nextInt();

        // Prompt the user to indicate if they have back trouble
        System.out.print("Do you have back trouble? (Y/N): ");
        String hasBackTrouble = input.next();

        // Prompt the user to indicate if they have heart trouble
        System.out.print("Do you have heart trouble? (Y/N): ");
        String hasHeartTrouble = input.next();

        // Check if the user's height is within the acceptable range (122-188 cm)
        if (height >= 122 && height <= 188) {
            // Check if the user has any back or heart trouble
            if (!hasBackTrouble.equalsIgnoreCase("Y") && !hasHeartTrouble.equalsIgnoreCase("Y")) {
                // If the user is within the height range and has no back or heart trouble, they can ride the roller coaster
                System.out.println("It is safe for you to ride the roller coaster!");
            } else {
                // If the user has back or heart trouble, they cannot ride the roller coaster
                System.out.println("Sorry, you are not allowed to ride the roller coaster.");
            }
        } else {
            // If the user is not within the height range, they cannot ride the roller coaster
            System.out.println("Sorry, you do not meet the height requirements for the roller coaster.");
        }
    }
}