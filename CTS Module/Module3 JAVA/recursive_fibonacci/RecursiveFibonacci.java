package recursive_fibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        scanner.close();
    }
}
