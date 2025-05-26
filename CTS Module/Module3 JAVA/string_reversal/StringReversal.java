package string_reversal;

import java.util.Scanner;

public class StringReversal {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed string: " + reverseString(input));
        scanner.close();
    }
}
