public class Lease {
    // Field to hold the name of the tenant
    private String tenantName;

    // Field to hold the apartment number
    private int apartmentNumber;

    // Field to hold the monthly rent amount
    private double monthlyRent;

    // Field to hold the lease term in months
    private int leaseTerm;

    // Default constructor initializes fields with default values
    public Lease() {
        this.tenantName = "XXX";        // Default tenant name
        this.apartmentNumber = 0;       // Default apartment number
        this.monthlyRent = 1000.0;      // Default monthly rent
        this.leaseTerm = 12;            // Default lease term is 12 months
    }

    // Getter for tenantName
    public String getTenantName() {
        return tenantName; // Returns the tenant's name
    }

    // Setter for tenantName
    public void setTenantName(String tenantName) {
        // Validates that the tenant name is not null or empty
        if (tenantName == null || tenantName.isEmpty()) {
            throw new IllegalArgumentException("Tenant name cannot be empty.");
        }
        this.tenantName = tenantName; // Sets the tenant's name
    }

    // Getter for apartmentNumber
    public int getApartmentNumber() {
        return apartmentNumber; // Returns the apartment number
    }

    // Setter for apartmentNumber
    public void setApartmentNumber(int apartmentNumber) {
        // Validates that the apartment number is positive
        if (apartmentNumber <= 0) {
            throw new IllegalArgumentException("Apartment number must be positive.");
        }
        this.apartmentNumber = apartmentNumber; // Sets the apartment number
    }

    // Getter for monthlyRent
    public double getMonthlyRent() {
        return monthlyRent; // Returns the monthly rent amount
    }

    // Setter for monthlyRent
    public void setMonthlyRent(double monthlyRent) {
        // Validates that the monthly rent is greater than zero
        if (monthlyRent <= 0) {
            throw new IllegalArgumentException("Monthly rent must be greater than zero.");
        }
        this.monthlyRent = monthlyRent; // Sets the monthly rent
    }

    // Getter for leaseTerm
    public int getLeaseTerm() {
        return leaseTerm; // Returns the lease term in months
    }

    // Setter for leaseTerm
    public void setLeaseTerm(int leaseTerm) {
        // Validates that the lease term is greater than zero
        if (leaseTerm <= 0) {
            throw new IllegalArgumentException("Lease term must be greater than zero months.");
        }
        this.leaseTerm = leaseTerm; // Sets the lease term
    }

    // Method to add a pet fee to the monthly rent
    public void addPetFee() {
        this.monthlyRent += 10; // Increases monthly rent by $10
        explainPetPolicy();      // Calls method to explain pet policy
    }

    // Static method to explain the pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to the monthly rent."); // Explains the pet fee
    }
}
