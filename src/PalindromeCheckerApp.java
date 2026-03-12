// PalindromeChecker class (Service class)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


// Main Application Class
public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        String word = "racecar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}