import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer to check if it's prime:");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
    private static boolean isPrime(int num, int divisor) {
        if (num <= 1) {
            return false; // 1 and any negative number are not prime
        }
        if (divisor > Math.sqrt(num)) {
            return true; // If no divisor found up to the square root of the number, it's prime
        }
        if (num % divisor == 0) {
            return false; // If the number is divisible by the current divisor, it's not prime
        }
        // Recursively check with the next divisor
        return isPrime(num, divisor + 1);
    }
}