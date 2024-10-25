import java.util.Scanner;
import java.util.InputMismatchException;

public class TestLease {

    public static void main(String[] args) {
        // Declare four Lease objects to represent individual lease agreements
        Lease lease1, lease2, lease3, lease4;

        // Get user input for the first three Lease objects
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();

        // Initialize the fourth Lease object using default values
        lease4 = new Lease();

        // Display the details of the first lease
        showValues(lease1);

        // Add a pet fee to the first lease and display updated values
        lease1.addPetFee();
        showValues(lease1);

        // Display the details of the remaining leases
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    // Method to prompt the user for Lease data and return a new Lease object
    public static Lease getData() {
        Scanner input = new Scanner(System.in);
        String tenantName;
        int apartmentNumber = 0;
        double monthlyRent = 0.0;
        int leaseTerm = 0;

        // Prompt for the tenant's name
        System.out.print("Enter tenant's name: ");
        tenantName = input.nextLine();

        // Input validation loop for apartment number
        while (true) {
            System.out.print("Enter apartment number: ");
            try {
                // Attempt to read an integer for the apartment number
                apartmentNumber = input.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                // Handle invalid input by prompting the user to try again
                System.out.println("Invalid input. Please enter an integer for the apartment number.");
                input.nextLine(); // Clear invalid input from scanner buffer
            }
        }

        // Input validation loop for monthly rent
        while (true) {
            System.out.print("Enter monthly rent amount: ");
            try {
                // Attempt to read a double for the monthly rent
                monthlyRent = input.nextDouble();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                // Handle invalid input by prompting the user to try again
                System.out.println("Invalid input. Please enter a number for the monthly rent.");
                input.nextLine(); // Clear invalid input from scanner buffer
            }
        }

        // Input validation loop for lease term in months
        while (true) {
            System.out.print("Enter term of lease in months: ");
            try {
                // Attempt to read an integer for the lease term
                leaseTerm = input.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                // Handle invalid input by prompting the user to try again
                System.out.println("Invalid input. Please enter an integer for the lease term.");
                input.nextLine(); // Clear invalid input from scanner buffer
            }
        }

        input.nextLine(); // Clear the buffer for further input

        // Create and return a new Lease object with the provided details
        Lease lease = new Lease();
        lease.setTenantName(tenantName);
        lease.setApartmentNumber(apartmentNumber);
        lease.setMonthlyRent(monthlyRent);
        lease.setLeaseTerm(leaseTerm);

        return lease;
    }

    // Method to display the values of a Lease object
    public static void showValues(Lease lease) {
        System.out.println("\nLease Information:");
        System.out.println("Tenant's Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term (months): " + lease.getLeaseTerm());
    }
}

// ==============================Output========================================
/*Enter tenant's name: fiza
Enter apartment number: 123
Enter monthly rent amount: 1400
Enter term of lease in months: 12
Enter tenant's name: alice
Enter apartment number: 124
Enter monthly rent amount: 1400
Enter term of lease in months: 13
Enter tenant's name: bob
Enter apartment number: 125
Enter monthly rent amount: 1400
Enter term of lease in months: 19

Lease Information:
Tenant's Name: fiza
Apartment Number: 123
Monthly Rent: $1400.0
Lease Term (months): 12
A pet fee of $10 has been added to the monthly rent.

Lease Information:
Tenant's Name: fiza
Apartment Number: 123
Monthly Rent: $1410.0
Lease Term (months): 12

Lease Information:
Tenant's Name: alice
Apartment Number: 124
Monthly Rent: $1400.0
Lease Term (months): 13

Lease Information:
Tenant's Name: bob
Apartment Number: 125
Monthly Rent: $1400.0
Lease Term (months): 19

Lease Information:
Tenant's Name: XXX
Apartment Number: 0
Monthly Rent: $1000.0
Lease Term (months): 12 */


// =================================== Output 2 =============================

// Negative Input
/*
 Enter tenant's name: fiz
Enter apartment number: -12
Enter monthly rent amount: 13
Enter term of lease in months: 12
Exception in thread "main" java.lang.IllegalArgumentException: Apartment number must be positive.
        at Lease.setApartmentNumber(Lease.java:35)
        at TestLease.getData(TestLease.java:51)
        at TestLease.main(TestLease.java:11)
 */



//  ==================================== Output 3 ==========================================
//  ================================  Invalid DataType =====================================
/*
 * 
Enter tenant's name: Maukhabbat
Enter apartment number: e 
Invalid input. Please enter an integer for the apartment number.
Enter apartment number: f
Invalid input. Please enter an integer for the apartment number.
Enter apartment number: 78
Enter monthly rent amount: 2500
Enter term of lease in months: 15
Enter tenant's name: Maksym
Enter apartment number: 45
Enter monthly rent amount: 670
Enter term of lease in months: 10
Enter tenant's name: Denys
Enter apartment number: 190
Enter monthly rent amount: 4500
Enter term of lease in months: 4

Lease Information:       
Tenant's Name: Maukhabbat
Apartment Number: 78
Monthly Rent: $2500.0
Lease Term (months): 15
A pet fee of $10 has been added to the monthly rent.

Lease Information:
Tenant's Name: Maukhabbat
Apartment Number: 78
Monthly Rent: $2510.0
Lease Term (months): 15

Lease Information:
Tenant's Name: Maksym
Apartment Number: 45
Monthly Rent: $670.0
Lease Term (months): 10

Lease Information:
Tenant's Name: Denys
Apartment Number: 190
Monthly Rent: $4500.0
Lease Term (months): 4

Lease Information:
Tenant's Name: XXX
Apartment Number: 0
Monthly Rent: $1000.0
Lease Term (months): 12
 */