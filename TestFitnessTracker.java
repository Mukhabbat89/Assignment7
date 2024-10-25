import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input for the first FitnessTracker object
        System.out.print("Enter the activity name: ");
        String activityName = scanner.nextLine();

        // Validate the activity name input
        while (activityName.trim().isEmpty()) {
            System.out.print("Activity name cannot be empty. Please enter the activity name: ");
            activityName = scanner.nextLine();
        }

        int minutesSpent = -1; // Initialize to an invalid value for validation
        // Validate the minutes spent input
        while (minutesSpent < 0) {
            System.out.print("Enter the number of minutes spent (must be a non-negative number): ");
            if (scanner.hasNextInt()) {
                minutesSpent = scanner.nextInt();
                if (minutesSpent < 0) {
                    System.out.println("Minutes spent must be non-negative. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        LocalDate activityDate = null; // Initialize to null for validation
        // Validate the activity date input
        while (activityDate == null) {
            System.out.print("Enter the activity date (YYYY-MM-DD): ");
            String dateInput = scanner.next(); // Read the date as a string
            try {
                activityDate = LocalDate.parse(dateInput); // Parse the date
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }

        // Create the first FitnessTracker object with user input
        FitnessTracker userTracker = new FitnessTracker(activityName, minutesSpent, activityDate);
        
        // Create the second FitnessTracker object using default constructor
        FitnessTracker defaultTracker = new FitnessTracker();

        // Display values for both objects
        System.out.println("\nUser-defined FitnessTracker:");
        System.out.println("Activity: " + userTracker.getActivityName());
        System.out.println("Minutes Spent: " + userTracker.getMinutesSpent());
        System.out.println("Activity Date: " + userTracker.getActivityDate());

        System.out.println("\nDefault FitnessTracker:");
        System.out.println("Activity: " + defaultTracker.getActivityName());
        System.out.println("Minutes Spent: " + defaultTracker.getMinutesSpent());
        System.out.println("Activity Date: " + defaultTracker.getActivityDate());

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
// =========================================Output============================
/*
 * Enter the activity name: running
Enter the number of minutes spent (must be a non-negative number): t
Invalid input. Please enter a number.
Enter the number of minutes spent (must be a non-negative number): 30
Enter the activity date (YYYY-MM-DD): 34
Invalid date format. Please use YYYY-MM-DD.
Enter the activity date (YYYY-MM-DD): 25-10-2024
Invalid date format. Please use YYYY-MM-DD.
Enter the activity date (YYYY-MM-DD): 2024-10-25

User-defined FitnessTracker:
Activity: running
Minutes Spent: 30
Activity Date: 2024-10-25

Default FitnessTracker:
Activity: running
Minutes Spent: 0
Activity Date: 2024-01-01
 */