import java.util.Scanner;

public class AsteriskPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the pyramid:");
        int numRows = scanner.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= numRows; i++) {
            
            // Loop to print leading spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Loop to print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }   

            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
