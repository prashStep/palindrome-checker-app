
public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        // Original string
        String word = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}