package JavaTask07;

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get age from user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Throw custom exception if age < 18
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }

            System.out.println("Access granted. Age is valid.");
        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle input errors
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}



