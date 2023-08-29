import java.util.Random;
import java.util.Scanner;

public class BinarySearchGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound) + 1;
        int attempts = 0;
        
        System.out.println("Welcome to the Binary Search Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        
        boolean hasGuessedCorrectly = false;
        while (!hasGuessedCorrectly) {
            int mid = (lowerBound + upperBound) / 2;
            System.out.println("Is the number " + mid + "? (Enter 'h' for higher, 'l' for lower, 'c' for correct): ");
            char response = scanner.next().charAt(0);
            attempts++;
            
            if (response == 'c') {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + mid + " in " + attempts + " attempts.");
            } else if (response == 'h') {
                lowerBound = mid + 1;
            } else if (response == 'l') {
                upperBound = mid - 1;
            } else {
                System.out.println("Invalid response. Please enter 'h', 'l', or 'c'.");
            }
        }
        
        scanner.close();
    }
}
