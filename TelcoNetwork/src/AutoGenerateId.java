import java.util.Scanner;

public class AutoGenerateId {

    // Method to auto-generate the next ID
    public static String generateNextId(String lastId) {
        // Check if the input ID starts with 'C' and has exactly 4 characters
        if (lastId.length() == 4 && lastId.startsWith("C")) {
            // Extract the numeric part from the ID
            String numericPart = lastId.substring(1);

            // Parse the numeric part to an integer and increment it by 1
            int number = Integer.parseInt(numericPart);
            number++;

            // Format the new number back into a 3-digit format (e.g., C001, C099, etc.)
            String newId = String.format("C%03d", number);

            return newId;
        } else {
            return "Invalid ID format. ID should start with 'C' followed by 3 digits.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the last ID from the user
        System.out.print("Enter the last ID (format: Cxxx): ");
        String lastId = scanner.nextLine();

        // Generate the next ID
        String newId = generateNextId(lastId);

        // Display the generated ID
        System.out.println("Generated ID: " + newId);

        scanner.close();
    }
}
