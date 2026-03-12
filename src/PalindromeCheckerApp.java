public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        String word = "racecar";

        boolean isPalindrome = checkPalindrome(word, 0, word.length() - 1);

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    // Recursive method to check palindrome
    public static boolean checkPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(word, start + 1, end - 1);
    }
}