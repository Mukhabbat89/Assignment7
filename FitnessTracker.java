import java.time.LocalDate;

public class FitnessTracker {
    // Data fields
    private String activityName;    // Name of the fitness activity
    private int minutesSpent;        // Minutes spent on the activity
    private LocalDate activityDate;  // Date of the activity

    // Default constructor
    public FitnessTracker() {
        this.activityName = "running";           // Default activity name
        this.minutesSpent = 0;                   // Default minutes spent
        this.activityDate = LocalDate.now().withDayOfYear(1); // Set date to January 1 of the current year
    }

    // Overloaded constructor
    public FitnessTracker(String activityName, int minutesSpent, LocalDate activityDate) {
        // Validate the parameters before assignment
        if (activityName == null || activityName.isEmpty()) {
            throw new IllegalArgumentException("Activity name cannot be null or empty."); // Error handling for activity name
        }
        if (minutesSpent < 0) {
            throw new IllegalArgumentException("Minutes spent cannot be negative."); // Error handling for minutes spent
        }
        if (activityDate == null) {
            throw new IllegalArgumentException("Activity date cannot be null."); // Error handling for activity date
        }

        this.activityName = activityName;        // Assign the activity name
        this.minutesSpent = minutesSpent;        // Assign minutes spent
        this.activityDate = activityDate;        // Assign the activity date
    }

    // Getter for activityName
    public String getActivityName() {
        return activityName; // Returns the activity name
    }

    // Getter for minutesSpent
    public int getMinutesSpent() {
        return minutesSpent; // Returns the number of minutes spent
    }

    // Getter for activityDate
    public LocalDate getActivityDate() {
        return activityDate; // Returns the activity date
    }
}
