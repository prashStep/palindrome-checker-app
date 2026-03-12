
public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}