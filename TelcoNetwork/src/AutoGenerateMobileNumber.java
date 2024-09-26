import java.util.Scanner;

public class AutoGenerateMobileNumber {

    // Method to auto-generate the next mobile number by incrementing the input number by 1
    public static String generateMobileNumber(String inputNumber) {
        // Convert the input number (as a String) to a long integer
        long mobileNumber = Long.parseLong(inputNumber);

        // Increment the mobile number by 1
        mobileNumber++;

        // Convert the incremented mobile number back to a string
        String generatedNumber = String.valueOf(mobileNumber);

        // Ensure that the generated number is still 10 digits by adding leading zeroes if needed
        if (generatedNumber.length() < 10) {
            generatedNumber = String.format("%010d", mobileNumber);
        }

        return generatedNumber;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the 10-digit mobile number input from the user
        System.out.print("Enter a 10-digit mobile number: ");
        String inputNumber = scanner.nextLine();

        // Validate that the input is a 10-digit number
        if (inputNumber.length() != 10 || !inputNumber.matches("\\d+")) {
            System.out.println("Invalid input. Please enter a valid 10-digit mobile number.");
            return;
        }

        // Generate the next mobile number by incrementing the user's input by 1
        String generatedMobileNumber = generateMobileNumber(inputNumber);

        // Display the generated mobile number
        System.out.println("Generated mobile number: " + generatedMobileNumber);

        scanner.close();
    }
}
