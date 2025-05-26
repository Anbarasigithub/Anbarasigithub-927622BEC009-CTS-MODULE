package palindrome_checker;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        scanner.close();
    }
}
