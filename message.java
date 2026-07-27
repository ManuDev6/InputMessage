// Import java.util

import java.util.Scanner;

public class message {
    
    // Main method

    public static void main(String[] args) {

        // Create scanner object

        Scanner scanner = new Scanner(System.in);

        // Input message

        System.out.println("Write a message:");
        String message = scanner.nextLine();

        // Print message
        
        System.out.println("Your message: " + message);

    }
}
