import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a phrase or word to check: ");
        String s = in.nextLine();

        // Call the method from the separate Solution1 class
        boolean result = sol.isPalindrome(s);

        System.out.println(); // Space for cleaner output
        if (result) {
            System.out.println("Result: \"" + s + "\" IS a valid palindrome!");
        } else {
            System.out.println("Result: \"" + s + "\" is NOT a valid palindrome.");
        }

        in.close();
    }
}